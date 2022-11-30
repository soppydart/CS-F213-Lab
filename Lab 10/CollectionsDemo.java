import java.util.*;
class CollectionsDemo
{
	public static void main(String args[])
	{
		ArrayList ar = new ArrayList();
		ar.add(89);
		ar.add(56);
		ar.add(98);
		ar.add(38);
		System.out.println(ar);
		Collections.sort(ar);	//sort by natural order
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		Collections.rotate(ar,2);
		System.out.println();
	}
}
