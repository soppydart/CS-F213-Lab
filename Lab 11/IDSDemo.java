//problem 8
import java.io.*;
class IDSDemo
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			int i = 16, k;
			double d = 13984.45, l;
			float f = 13.45f, m;
			dos.writeDouble(d);
			dos.writeInt(i);
			dos.writeFloat(f);	//boolean, char, etc are also possible
			FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis);
			l = dis.readDouble();
			k = dis.readInt();
			m = dis.readFloat();	//boolean, char, etc are also possible
			System.out.println("Integer : "+k);
			System.out.println("Double : "+l);
			System.out.println("Float : "+m);
		}
		catch(IOException e)
		{
			System.out.println("Exception : "+e);
		}
	}
}
