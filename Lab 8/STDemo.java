import java.util.*;
class STDemo
{
	public static void main(String args[])
	{
		StringTokenizer st = new StringTokenizer(args[0],args[1]);
		System.out.println("Number of tokens is "+st.countTokens());
		System.out.println("Printing the tokens...");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
