class Line
{
	static
	{
		System.out.println("Inside static block");
	}
	static int length;
	int width;
	Line(int l, int w)
	{
		System.out.println("Inside constructor");
		length = l;
		width = w;
	}
}
class LineTest
{
	public static void main(String args[])
	{
		Line l1 = new Line(10,5);
		Line l2 = new Line(20,10);
		System.out.println(l1.length);
		System.out.println(l1.width);
		System.out.println(l2.length);
		System.out.println(l2.width);
	}
}
