//problems 5 and 6
import java.io.*;
public class IOFileObjectDemo
{
	public static void main(String args[])
	{
		File f1 = new File(args[0]);
		System.out.println("File name : "+f1.getName());
		boolean b = f1.isDirectory();
		if(b)
			System.out.println("File : "+f1.getName()+" is a directory");
		else
			System.out.println("File : "+f1.getName()+" is a file");
		System.out.println("Length of file : "+f1.getName()+" is : "+f1.length());
		System.out.println("Parent of file : "+f1.getName()+" is : "+f1.getParent());
	}
}
