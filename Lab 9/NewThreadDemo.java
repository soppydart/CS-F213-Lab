class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t = new Thread(this, "DemoThread");
		System.out.println("Child Thread: "+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread: "+i);
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
class NewThreadDemo
{
	public static void main(String args[])
	{
		new NewThread();
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Main Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main thread interrupted");
		}
		System.out.println("Exiting main thread...");
	}
}
		
