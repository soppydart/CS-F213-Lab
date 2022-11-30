class MyThread1 extends Thread
{
	MyThread1(String s)
	{
		super(s);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=26;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(Thread.currentThread()+" interrupted");
		}
		System.out.println("Child thread 1 exiting");
	}
}
class MyThread2 extends Thread
{
	MyThread2(String s)
	{
		super(s);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=65;i<=90;i++)
			{
				System.out.println((char)i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(Thread.currentThread()+" interrupted");
		}
		System.out.println("Child thread 2 exiting");
	}
}
class Exercise
{
	public static void main(String args[])
	{
		new MyThread1("One");
		new MyThread2("Two");
	}
}
