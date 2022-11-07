class StaticTest
{
	static
	{
		System.out.println("Inside static block of class StaticTest");
	}
	static int item;
	static void show()
	{
		System.out.println("Hello world");
	}
	public static void main(String args[])
	{
		show();
		item = 20;
		System.out.println(item);
	}
}
