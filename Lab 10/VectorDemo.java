import java.util.*;
class VectorDemo
{
	public static void main(String args[])
	{
		Vector v = new Vector();	//default capacity 10
		System.out.println(v.capacity());
		v.add("Raju");
		v.add("Ok");
		System.out.println(v.size());
		System.out.println(v);
	}
}
