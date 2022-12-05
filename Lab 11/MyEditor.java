//problem 2
import java.io.*;
public class MyEditor
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		System.out.println("Enter lines of text");
		System.out.println("Enter stop to exit");
		for(int i=0;i<100;i++)
		{
			try
			{
				str[i] = br.readLine();
				if(str[i].equals("stop"))
					break;
			}
			catch(IOException e)
			{
				System.out.println("Exception : "+e);
			}
		}
		System.out.println("Now printing the file you edited: ");
		for(int i=0;i<100;i++)
		{
			if(str[i].equals("stop"))
				break;
			System.out.println(str[i]);
		}		
	}
}
