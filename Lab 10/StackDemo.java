import java.util.*;
public class StackDemo
{
	public static void main(String args[])
	{
		Stack st = new Stack();
		st.push("Raju");
		st.push("Ok");
		st.push("Tom");
		System.out.println(st);
		st.pop();
		System.out.println(st);
	}
}
