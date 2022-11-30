// Same as NewThread but extended Thread class instead of implementing Runnable
class NewThread2 extends Thread
{
	NewThread2()
	{
		start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child thread "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child...");
	}
}
class NewThreadDemo2
{
	public static void main(String args[])
	{
		new NewThread2();
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main thread "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main interrupted");
		}
		System.out.println("Exiting main thread...");
	}
}
			
