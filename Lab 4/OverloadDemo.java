class Shape
{
	int computeArea(int s)
	{
		return s*s;
	}
	int computeArea(int x, int y)
	{
		return x*y;
	}
	float computeArea(float s){return s*s;}
}
class OverloadDemo
{
	public static void main(String args[])
	{
		Shape s = new Shape();
		System.out.println("Area of a suare of side 5 is "+s.computeArea(5));
		System.out.println("Area of a rectangle of sides 10 and 20 is "+s.computeArea(10,20));
	}
}
