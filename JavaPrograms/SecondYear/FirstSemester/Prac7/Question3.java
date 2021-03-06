import java.util.*;
public class Question3
{
	static Scanner Reddo = new Scanner (System.in);
	static int number = 1048576;
	static int [] power_twenty = new int [number];
	static int [] sorted_nums = new int [number];
	static int crrnt_index = 0;
	
	public static void main (String[] args)
	{	
		System.out.println("Starting...");
		
		for (int i = 0; i < number; i++)
			power_twenty [i] = i + 1;
			
		double [] time = new double [1000];
		double first_w = System.currentTimeMillis();
		for (int i = 0; i < 1000; i ++)
		{
			double first = System.currentTimeMillis();
			crrnt_index = 0;
			balanceSort(power_twenty);
			double last = System.currentTimeMillis();
			time [i] = last - first;
		} double last_w = System.currentTimeMillis();
		
		double avg_w = (last_w - first_w) / 1000000;
		
		double std_dev = 0.0;
		for (int i = 0; i < 1000; i ++)
		{
			std_dev = std_dev + Math.pow(avg_w - time [i], 2);
		} std_dev = Math.pow(std_dev / 999, 0.5);
		
		System.out.println("Average time: " + avg_w);
		System.out.println("Standard Deviation: " + std_dev);
		
		BST tree = new BST();
		for (int i = 0; i < number; i++)
			tree.insert(i);
	}
	
	public static void balanceSort (int [] sort_me)
	{		
		if (sort_me.length == 1)
		{
			sorted_nums [crrnt_index] = sort_me [0];
			crrnt_index ++;
		}
		else if (sort_me.length == 2)
		{
			sorted_nums [crrnt_index] = sort_me [1];
			crrnt_index ++;
			sorted_nums [crrnt_index] = sort_me [0];
			crrnt_index ++;
		}
		else
		{
			int middle_index = sort_me.length / 2;
			sorted_nums [crrnt_index] = sort_me [middle_index];
			crrnt_index ++;
		
			int [] left_half;
			int [] right_half;
			
			if (sort_me.length % 2 == 0)
			{
				left_half = new int [sort_me.length - middle_index];			
				right_half = new int [sort_me.length - middle_index - 1];
			}
			else
			{
				left_half = new int [sort_me.length - middle_index - 1];
				right_half = new int [sort_me.length - middle_index - 1];
			}
			
			System.arraycopy(sort_me, 0, left_half, 0, left_half.length);
			System.arraycopy(sort_me, middle_index + 1, right_half, 0, right_half.length);
				
			balanceSort(left_half);
			balanceSort(right_half);
		}
	}
}
