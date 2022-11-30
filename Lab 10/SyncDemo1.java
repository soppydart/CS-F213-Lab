class Box
{
	/*void show()	//non synchronized show method
	{
		System.out.print("[+++");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{}
		System.out.print("]");
	}
	*/
	
	synchronized void show()	//synchronized show method
	{
		System.out.print("[+++");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{}
		System.out.print("]");
	}
}
class MyThread extends Thread
{
	static Box b = new Box();	//since static, all threads will share the same Box object
	MyThread()
	{
		start();
	}
	public void run()
	{
		b.show();
	}
}
class SyncDemo1
{
	public static void main(String args[])
	{
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		try
		{
			Thread.sleep(8000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie+" interrupted");
		}
		System.out.println();
	}
}	
