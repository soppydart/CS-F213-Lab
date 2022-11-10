import java.util.*;
class Exercise1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in Fahrenheit");
		int fah = sc.nextInt();
		int cel = (int) (5.0 * (fah - 32) / 9.0);  // Omit the decimal part
		System.out.println("The temperature in Celsius is "+cel);
	}
}	
