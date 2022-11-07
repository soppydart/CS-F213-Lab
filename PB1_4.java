class PB1_4
{
	public static void main(String[] args)
	{
		int item[] = new int[3];
		for(int i=1; i<4;i++)
		{
			item[i-1] = i*10;
		}
		System.out.println("Printing array elements...");
		for(int i=0;i<3;i++)
		{
			System.out.println("Item stored at index "+i+" is "+item[i]);
		}
	}
}
