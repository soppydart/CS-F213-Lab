//problem 4
import java.io.*;
public class FileDemo2
{
	public static void main(String args[])
	{
		FileInputStream fis;
		FileOutputStream fos;
		int i;
		//Open input file
		try
		{
			fis = new FileInputStream(args[0]);
		}
		catch(IOException e)
		{
			System.out.println("File "+args[0]+" not found");
			return;
		}
		//Open output file
		try
		{
			fos = new FileOutputStream(args[1]);
		}
		catch(IOException e)
		{
			System.out.println("File "+args[1]+" not found");
			return;
		}
		//Copy file content from test.txt to newFile.txt
		try
		{
			do
			{
				i = fis.read();
				if(i != -1)
					fos.write(i);
			}
			while( i!= -1);
		}
		catch(IOException e)
		{
			System.out.println("Exception "+e);
		}
		try
		{
			fis.close();
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception "+e);
		}
	}
}
