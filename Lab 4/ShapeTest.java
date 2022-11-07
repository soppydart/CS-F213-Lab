class Shape
{
	void ComputeArea()
	{
		System.out.println("Area of shape");
	}
}
class Triangle extends Shape
{
	int b,h;
	Triangle(int x, int y)
	{
		b = x;
		h = y;
	}
	void ComputeArea()
	{
		System.out.println(0.5*b*h);
	}
}
class Square extends Shape
{
	int side;
	Square(int s)
	{
		side = s;
	}
	void ComputeArea()
	{
		System.out.println(side*side);
	}
}
class ShapeTest
{
	public static void main(String args[])
	{
		Shape s = new Shape();
		s.ComputeArea();
		Triangle t = new Triangle(4,6);
		t.ComputeArea();
		Square sq = new Square(5);
		sq.ComputeArea();
	}
}
