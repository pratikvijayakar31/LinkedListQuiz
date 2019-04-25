import java.io.*;
import java.util.*;



public class LinkedList
{
	Node head = null;
	Node tail = null;

	
	class Node 
	{
		int val;
		Node next;

		Node(int x)
		{
			val = x;
			next = null;
		}
	};
	
	

	void printLinkedList()
	{
		Node ptr;
		ptr = this.head;
		if (this.head == null)
		{
			System.out.println("The Linked List is Empty ");
		}
		else
		{
			System.out.print("Linked List is :- ");
			System.out.print("[");
			while (ptr.next != null)
			{
				System.out.print( Integer.toString(ptr.val)+"->");
				ptr = ptr.next;
	
			}
			System.out.print( Integer.toString(ptr.val));
			System.out.print("]\n");
		}
	}

	void appendNode(int x)
	{
		Node node = new Node(x);
		if (this.tail == null)
		{
			this.head = node;
			this.tail = this.head;
		}
		else
		{
		this.tail.next = node;
		this.tail = this.tail.next; 
		}
	}


	void removeTailElement()
	{
		if (this.tail == null)
		{
			System.out.println("Error, Linked List is already empty");
		}
		else if (this.head.next == null)
		{	
			System.out.println("Node with value " + Integer.toString(this.tail.val) + " is deleted");
			this.tail = null;
			this.head = null;
		}
		else
		{
			Node ptr = this.head;
			while (ptr.next != this.tail)
			{
				ptr = ptr.next;
			}
			ptr.next = null;
			this.tail = ptr;
			System.out.println("Node with value " + Integer.toString(this.tail.val) + " is deleted");
		}


	}

	
	void deleteLinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	
	void removeElementsLargerThanTarget(int target)
	{
		Node new_head = null;
		Node p1 = new_head;
		Node p2 = this.head;

		while (p2 != null)
		{
			if (p2.val <= target)
			{	
				if (new_head == null)
				{
					new_head = p2;
					p1 = new_head;
				}
				else
				{
					p1.next = p2;
					p1 = p1.next;
				}
			}
			p2 = p2.next;
		}
		if (p1 == null)
		{
			this.tail = null;
			this.head = null;
		}
		else
		{	
			p1.next = null;
			this.tail = p1;
			this.head = new_head;
		}
	}


};



