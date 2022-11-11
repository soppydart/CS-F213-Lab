import java.util.*;
class Stack
{
	int arr[], top; 
	Stack(int s)
	{
		arr = new int[s];
		top = -1;
	}
	public void push(int n)
	{
		System.out.println();
		if(top == arr.length - 1)
		System.out.println("Stack Overflow");
		else
		{
			arr[++top] = n;
			System.out.println(n + " was added to the stack");
		}
	}
	public int pop()
	{
		System.out.println();
		if(top==-1){
			System.out.println("Stack Underflow");
			return -1;
		}
		else
		{
			int num = arr[top];
			top--;
			System.out.println(num + " was removed from the stack");
			return num;
		}
	}
	public void displayStack()
	{
		System.out.println();
		System.out.println("Displaying stack");
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
class StackDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack");
		int size = sc.nextInt();
		Stack st = new Stack(size);
		int n;
		//st.push(5);
		//st.push(10);
		//st.displayStack();
		//st.pop();
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
