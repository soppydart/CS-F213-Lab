class Line
{
	int length;
	void printLength()
	{
		System.out.println("Length is: "+length);
	}
}
class PB1_2
{
	public static void main(String args[])
	{
		System.out.println("Executing second program...");
		Line l1 = new Line();
		System.out.println("The length right now is "+l1.length);
		l1.length = 20;
		l1.printLength();
	}
}
