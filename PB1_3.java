class PB1_3
{
	public static void main(String []args)
	{
		int a, first;
		float f;
		boolean b;
		int marks[]= new int[5];
		a = 5;
		b = true;
		f = 30.75f;
		first = 50;
		System.out.println("Assigning values to array locatons");
		for(int x=0; x<5;x++)
		{
			marks[x] = first;
			first += 5;
		}
		System.out.println("Value of integer a is "+a);
		System.out.println("Value of float f is "+f);
		System.out.println("Value of boolean b is "+b);
		System.out.println("Printing array elements...");
		for(int i=0;i<5;i++)
		{
			System.out.println("Value at index ["+i+"] is "+marks[i]);
		}
	}
}
