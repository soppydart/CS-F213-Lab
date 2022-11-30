import java.util.*;
class ArrayListDemo1
{
	public static void main(String args[])
	{
		ArrayList ar = new ArrayList();
		ar.add("Java");
		ar.add("OK");
		ar.add(new Integer(7));
		ar.add(38);
		System.out.println(ar);
		System.out.println(ar.size());
		ar.add(2,50);
		System.out.println(ar);
		ar.remove("OK");
		System.out.println(ar);
		String s = (String)ar.get(0);	//because it returns Object type
		System.out.println(s);
	}
}
