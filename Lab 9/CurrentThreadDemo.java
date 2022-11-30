class CurrentThreadDemo
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();	// to get the reference to the main thread
		System.out.println("Printing main thread details: "+t);
		t.setName("MyThread");
		t.setPriority(7);
		System.out.println("After changes, printing details of thread:");
		System.out.println(t);
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main thread interrupted.");
		}
	}
}
