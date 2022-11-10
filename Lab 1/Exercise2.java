import java.util.*;
class Exercise2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		int r = sc.nextInt();
		double diameter, circumference, area;
		diameter = 2 * r;
		circumference = 2 * 3.1416 * r;
		area = 3.1416 * r * r;
		System.out.println("Diameter of the circle : "+diameter);
		System.out.println("Circumference of the circle : "+circumference);
		System.out.println("Area of the circle : "+area);
	}
}
