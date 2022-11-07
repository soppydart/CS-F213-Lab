import java.util.*;
class Node
{
	int data;
	Node * next;
	Node * prev;
	Node(int n)
	{
		data = n;
	}
}
class Stack
{
	Node start = new Node();
	Node ptr;
	Stack(int n)
	{
		start.next = null;
		start.prev = null;
		start.data = n;
		ptr = start;
	}
	public void push(int n)
	{
		Node node = new Node(n);
		ptr.next = node;
		ptr= ptr.next;
	}
	public int pop()
	{
		if(ptr == null)
		{
			System.out.println("Stack Underflow");
		}
		int num = ptr.data;
		ptr = ptr.prev;
		ptr.next = null;
		return num;
	}
	public void displayStack()
	{
		Node nptr;
		nptr = start;
		while(nptr!=null)
		{
			System.out.println(nptr.data);
			nptr = nptr.next;
		}
	}
}
class StackLinkedList
{
	public static void main(String args[])
	{
		Stack st = new Stack(10);
		st.push(50);
		st.push(1000);
		st.displayStack();
		st.pop();
		st.displayStack();
	}
}
