class Box
{
	int length, width, height;
	String name;
	void printBoxDetails()
	{
		System.out.println("Box length is "+length);
		System.out.println("Box width is "+width);
		System.out.println("Box height is "+height);
		System.out.println("Box name is "+name);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Box b = new Box();
		b.printBoxDetails();
	}
}
