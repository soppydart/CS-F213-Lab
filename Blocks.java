class Blocks
{
	public static void main(String args[])
	{
		boolean t = false;
		first:{
			second:{
				third:{
					System.out.println("Before the break");
					if(t) break third;
					System.out.println("This is in block third");
					}
				System.out.println("This is in block second");
			}
			System.out.println("This is after second in block first");
		}
	}
}
