// package pracs;


public class SLinkedListTest 
{	
	public SLinkedListTest()
	{
		Node a = new Node();
        	Node b = new Node();
        	Node c = new Node();
        	Node d = new Node();
        	Node e = new Node();
        	a.setElement("A");
        	b.setElement("B");
        	c.setElement("C");
        	d.setElement("D");
        	a.setNext(b);
        	b.setNext(c);
        	c.setNext(d);
        	d.setNext(null);
        	SLinkedList list = new SLinkedList();
        	list.setHead(a);
        	System.out.println(list);
        	System.out.println("Check if \"C\" is contained in the list:");
        	System.out.println(list.containsItem("C"));
        	System.out.println("Insert \"B\" at tail:");
        	list.insertAtTail("B");
        	System.out.println(list);
        	System.out.println("Find first position of \"B\":");
        	System.out.println(list.firstPositionOfItem("B"));
        	System.out.println("Check if list is empty:");
        	System.out.println(list.isEmpty());
        	System.out.println("Check number of Occurrences of \"B\":");
        	System.out.println(list.noOfOccurrences("B"));
        	System.out.println("Insert \"B\" at tail:");
        	list.insertAtTail("B");
        	System.out.println(list);
        	System.out.println("Insert \"B\" at tail:");
        	list.insertAtTail("B");
        	System.out.println(list);
        	System.out.println("Insert \"B\" at tail:");
        	list.insertAtTail("B");
        	System.out.println(list);
        	System.out.println("Insert \"B\" at tail:");
        	list.insertAtTail("B");
        	System.out.println(list);
        	System.out.println("Delete last Occurrence of \"B\":");
        	list.deleteLastOccurrence("B");
        	System.out.println(list);
        	System.out.println("Delete first Occurrence of \"B\"");
        	list.deleteFirstOccurrence("B");
        	System.out.println(list);
		System.out.println("Delete all Occurrences of \"B\":");
	        list.deleteAllOccurrences("B");
 	        System.out.println(list);
 	        System.out.println("Insert \"F\" at index 1:");
 	        list.insertAtIndex(1, "F");
 	        System.out.println(list);
 	        System.out.println("Insert \"X\" at index 3:");
 	        list.insertAtIndex(3, "X");
 	        System.out.println(list);
 	        System.out.println("Insert \"Z\" at index 4:");
 	        list.insertAtIndex(4, "Z");
 	        System.out.println(list);
 	        System.out.println("Insert \"W\" at index 6:");
 	        list.insertAtIndex(6, "W");
 	        System.out.println(list);
 	        System.out.println("Replace index 3 with \"Y\":");
 	        list.replaceAtIndex(3, "Y");
 	        System.out.println(list);
 	        System.out.println("Insert \"3\" :");
 	        list.insertInFront("3");
 	        System.out.println(list);
  	        System.out.println("Insert \"1\" at front:");
  	        list.insertInFront("1");
  	        System.out.println(list);
  	        System.out.println("Insert \"2\" at front:");
  	        list.insertInFront("2");
  	        System.out.println(list);
	}
	
	public static void main(String[] args)
	{
		new SLinkedListTest();
	}
}
