import java.util.*;
import java.io.*;

class Main
{
	public static void main(String args [])
	{	
		Scanner sc = new Scanner(System.in);
		int choice, value;

		LinkedList l = new LinkedList();
		System.out.println("Linked List");

		do
		{
			System.out.println("\n1. Append an element into the linkedlist"+
								"\n2. Remove the tail element from a linkedlist"+
								"\n3. Remove all elements in the linkedlist that are greater than a target value"+
								"\n4. Print the Linked List"+
								"\n5. Delete all nodes in the Linked List"+
								"\n6. Exit\n");

			System.out.println("\nSelect the choice number : ");
			choice = sc.nextInt();
			switch (choice)
			{
				case 1 : System.out.println("Enter the value to be appended to the Linked List");
						 value = sc.nextInt();
						 l.appendNode(value);
						 break;

				case 2 : l.removeTailElement();
						 break;

				case 3 : System.out.println("Enter the target value");
						 value = sc.nextInt();
						 l.removeElementsLargerThanTarget(value);
						 break;

				case 4 : l.printLinkedList();
						 break;
				
				case 5	: l.deleteLinkedList();
						  break;
						
				case 6	: System.out.println("Thank You !!"); 
						  break;
				
				default	: System.out.println("Invalid Selection");
						  break;
				
			}
			
			
		} while (choice != 6);
		
		
	}



}