class MyThread extends Thread
{
	MyThread(String s)
	{
		super(s);
		System.out.println(s+" created.");
		start();
	}
	public void run()
	{
		System.out.println(Thread.currentThread()+" started execution");
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread()+" printing: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(Thread.currentThread()+" interrupted");
		}
		System.out.println(Thread.currentThread()+" completed the task");
	}
}
class JoinDemo1
{
	public static void main(String args[])
	{
		Thread mt = new MyThread("Child");
		Thread t = Thread.currentThread();
		t.setName("MAIN THREAD");
		System.out.println(t.getName()+" started: ");
		try
		{
			mt.join();	//main thread will wait till mt finishes
			System.out.println("Hello world");
		}
		catch(InterruptedException ie)
		{
			System.out.println(mt+" interrupted");
		}
		System.out.println("Last statement in main thread");
	}
}
