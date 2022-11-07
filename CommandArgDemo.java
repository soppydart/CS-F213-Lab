class CommandArgDemo
{
	public static void main(String args[])
	{
		int a; String str;
		a = Integer.parseInt(args[0]);
		str = args[1];
		System.out.println("Hello");
		System.out.println("First argument(int) is "+a);
		System.out.println("Second argument(string) is "+str);
	}
}
