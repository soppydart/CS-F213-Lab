//problem 3
import java.io.*;
public class FileDemo
{
	public static void main(String args[])
	{
		FileInputStream fis; 
		int i;
		try
		{
			fis = new FileInputStream(args[0]);
			while(!((i=fis.read())==-1))
			{
				System.out.print((char)i);
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception : "+e);
			return;
		}
		try
		{
			fis.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception : "+e);
		}
	}
}
