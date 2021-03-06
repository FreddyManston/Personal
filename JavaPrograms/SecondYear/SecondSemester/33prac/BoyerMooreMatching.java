// Name: Boyer-Moore and Knuth-Morris-Prat Pattern Matching
// Author: Joshua Abraham
// Description: 

import java.io.*;
import java.util.*;

public class BoyerMooreMatching {
	public static void main (String[] args) {
		try {	
			File text_file = new File("lesmiserables.text");
			File pat_file = new File("patterns.text");
			FileInputStream text_input = new FileInputStream(text_file);
			FileInputStream pat_input = new FileInputStream(pat_file);

			byte [] text_data = new byte[(int) text_file.length()];
			byte [] pat_data = new byte[(int) pat_file.length()];
			text_input.read(text_data);
			text_input.close();
			pat_input.read(pat_data);
			pat_input.close();

			String book = new String(text_data, "UTF-8");
			String patterns = new String(pat_data, "UTF-8");
			
			String [] text = book.split(" ");
			String [] pat = patterns.split(" ");
			
			int counter = 0;
			for (int i = 0; i < pat.length; i ++) {
				if (BoyerMoore(text, pat [i])) { counter ++; }
			}
			System.out.println(counter);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean BoyerMoore (String[] text, String pat) {
		int pat_len = pat.length();
		int word_len = 0, skip = 0;
		int [] lastInP = lastInP(pat);
		String word = "";
		
		// Loop to run through the words in text
		for (int i = 0 ; i < text.length; i ++) {
			word = text [i];
			word_len = word.length();
			if (pat_len > word_len || pat_len == 0) { return false; }
						
			// Loop to run through the characters in word
			for (int j = 0; j < word_len; j += skip) {
				skip = 0;
				// Loop to run through the characters in pattern
				for (int k = pat_len - 1; k >= 0; k --) {
					if (j + k >= word_len) { 
						skip = -1;
						break; } 
					else if (pat.charAt(k) != word.charAt(j + k)) {
						skip = k - lastInP [word.charAt(j + k)];
						break;
					}
				}
				if (skip == 0) { return true; }
				else if (skip == -1) { break; }
			}
		}
		return false;
	}

	public static int[] lastInP (String pat) {
		int [] lastInP = new int [255];
		Arrays.fill(lastInP, -1);

		for (int i = 0; i < pat.length(); i ++) {
			lastInP[(int) pat.charAt(i)] = i;
		}
		return lastInP;
	}
}
