class Box
{
	int length, breadth, height;
	Box()
	{
		length = 10;
		breadth = 5;
		height = 2;
	}
	Box(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	void printBoxDetails()
	{
		System.out.println("Length is "+length);
		System.out.println("Breadth is "+breadth);
		System.out.println("Height is "+height);
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		Box b2 = new Box(100,200,300);
		//Box b3 = new Box(50,60); error
		System.out.println("Initialized with default constructor");
		b1.printBoxDetails();
		System.out.println("Initialized with three argument constructor");
		b2.printBoxDetails();
	}
}
