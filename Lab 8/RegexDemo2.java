import java.util.regex.*;
public class RegexDemo2
{
	public static void main(String args[])
	{
		//starting with 1 or more 'a's, ending with 6 'b's, any combination of 'a's and 'b's in between
		boolean b = Pattern.matches("[a]+[ab]*[b]{6}",args[0]);
		if(b)
			System.out.println("Valid string");
		else
			System.out.println("Invalid string");
	}
}
