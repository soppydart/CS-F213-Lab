import java.util.*;
public class ArrayListDemo2
{
	public static void main(String args[])
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		//ar.add("Java")	is an error and not allowed
		ar.add(45);
		System.out.println(ar);
		Integer i = ar.get(0);	//because it returns Object type
		System.out.println(i);
	}
}
