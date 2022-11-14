import java.util.*;
class Node
{
	int val;
	Node next;
	Node prev;
	Node(int x)
	{
		val = x;
		next = null;
		prev = null;
	}
}
class DLL
{
	Node head, tail;
	DLL(int n)
	{
		head = new Node(-9999);
		Node ptr = new Node(n);
		tail = ptr;
		head.next = tail;
		tail.prev = head;
	}
	void append(int n)
	{
		System.out.println();
		Node ptr = new Node(n);
		tail.next = ptr;
		ptr.prev = tail;
		tail = tail.next;
	}
	void insert(int n, int index)
	{
		Node ptr = head;
		while(index!=0 && ptr!=null)
		{
			ptr = ptr.next;
			index--;
		}
		if(index != 0)
		{
			System.out.println();
			System.out.println("Invalid index");
		}
		else
		{
			if(ptr.next == null)
			append(n);
			else
			{
				Node nptr = new Node(n);
				nptr.next = ptr.next;
				(ptr.next).prev = nptr;
				nptr.prev = ptr;
				ptr.next = nptr;
			}
		}
	}
	void delete(int index)
	{
		index++;
		Node ptr = head;
		while(index!=0 && ptr!=null)
		{
			index--;
			ptr = ptr.next;
		}
		if(index != 0)
		{
			System.out.println();
			System.out.println("Invalid index");
		}
		else
		{
			if(ptr.next == null)
			{
				Node nptr = ptr.prev;
				ptr.prev = null;
				nptr.next = null;
			}
			else
			{
				Node nptr = ptr.prev;
				nptr.next = ptr.next;
				(ptr.next).prev = nptr;
				ptr.next = null;
				ptr.prev = null;
			}
		}
	}
	void search(int x)
	{
		Node ptr = head;
		boolean flag = false;
		while(ptr != null)
		{
			if(ptr.val == x)
			{
				flag = true;
				break;
			}
			ptr = ptr.next;
		}
		System.out.println();
		if(flag)
		System.out.println("Found");
		else
		System.out.println("Not Found");
	}
			
	void printList()
	{
		System.out.println();
		System.out.println("Displaying : ");
		Node ptr = head.next;
		while(ptr != null)
		{
			System.out.println(ptr.val);
			ptr = ptr.next;
		}
	}
}
class ListDemo
{
	public static void main(String args[])
	{
		DLL d = new DLL(5);
		d.append(10);
		d.append(15);
		d.printList();
		d.insert(9,1);		
		d.printList();
		d.delete(1);		
		d.printList();
		d.search(5);
		d.search(9);
	}
}
