import java.util.*;
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int x)
	{
		data = x;
		next = null;
		prev = null;
	}
}
class StackLL
{
	Node head, tail;
	StackLL(int n)
	{
		head = new Node(-9999);
		Node ptr = new Node(n);
		tail = ptr;
		head.next = tail;
		tail.prev = head;
	}
	void push(int n)
	{
		System.out.println();
		Node ptr = new Node(n);
		tail.next = ptr;
		ptr.prev = tail;
		tail = tail.next;
		System.out.println(n + " was added to the stack.");
	}
	int pop()
	{
		System.out.println();
		if(tail == head)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		else
		{
			int a = tail.data;
			Node ptr = tail.prev;
			tail.prev = null;
			ptr.next = null;
			tail = ptr;
			System.out.println(a + " was removed from the stack.");
			return a;
		}
	}
	void displayStack()
	{
		System.out.println();
		System.out.println("Displaying stack : ");
		Node ptr = head.next;
		while(ptr != null)
		{
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}
class StackLinkedlist
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value in the stack.");
		int x = sc.nextInt();
		StackLL st = new StackLL(x);
		int n;
		System.out.println();
		while(true)
		{
			System.out.println("Press 1 to push, 2 to pop, 3 to display and 4 to exit");
			n = sc.nextInt();
			if(n==1)
			{
				System.out.println();
				System.out.println("Enter number to push");
				int num = sc.nextInt();
				st.push(num);
			}
			if(n==2)
			{
				st.pop();
			}
			if(n==3)
			{
				st.displayStack();
			}
			if(n==4)
			{
				System.out.println();
				System.out.println("Exiting...");
				System.out.println();
				break;
			}
			System.out.println();
		}
	}
}
