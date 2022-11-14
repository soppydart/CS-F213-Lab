import java.util.regex.*;
public class RegexDemo
{
	public static void main(String args[])
	{
		boolean b = Pattern.matches("[1-7][0-9]{5}",args[0]);
		if(b)
			System.out.println("Valid zipcode");
		else
			System.out.println("Invalid zipcode");
	}
}
