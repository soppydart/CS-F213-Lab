class Box
{
	int length, breadth, height;
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
	int volume()
	{
		return length*breadth*height;	
	}
	void SetDimensions(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
}
class BoxVolume
{
	public static void main(String args[])
	{
		Box b = new Box(10,20,30);
		b.printBoxDetails();
		System.out.println("Volume is "+b.volume());
		b.SetDimensions(100,200,300);
		System.out.println("New dimensions are ");
		b.printBoxDetails();
		System.out.println("New volume is "+b.volume());
	}
}
