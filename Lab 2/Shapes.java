import java.util.*;
class Shapes
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int c = -1;
		while(c!=0)
		{
			System.out.println("Enter 1 for Circle, 2 for rectangle, 3 for square and 0 to quit");
			c = sc.nextInt();
			if(c==1)
			{
				System.out.println("Enter radius");
				int radius = sc.nextInt();
				System.out.println("The perimeter is "+(2*3.142*radius));
			}
			else if(c==2)
			{
				System.out.println("Enter length and breadth");
				int length = sc.nextInt();
				int breadth = sc.nextInt();
				System.out.println("Area is "+(length*breadth));
				System.out.println("Perimeter is "+2*(length+breadth));
			}
			else if(c==3)
			{
				System.out.println("Enter side");
				int side = sc.nextInt();
				System.out.println("Area is "+side*side);
				System.out.println("Perimeter is "+4*side);
			}
			else if(c==0)
			{
				System.out.println("Quitting...");
				break;
			}
			else
			{
				System.out.println("Wrong input");
			}
		}
	}
}
