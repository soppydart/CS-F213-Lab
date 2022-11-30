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
class ThreadDemo
{
	public static void main(String args[])
	{
		Thread t1 = new MyThread("One");
		Thread t2 = new MyThread("Two");
		Thread t3 = new MyThread("Three");
		Thread t = Thread.currentThread();
		t.setName("MAIN THREAD");
		System.out.println(t+" started execution");
		try
		{
			t1.join();
			t2.join();
			t3.join();
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" printing: "+i);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(t+" interrupted");
		}
		System.out.println(t+" completed the task");
	}
}
