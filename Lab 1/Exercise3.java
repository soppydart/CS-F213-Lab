import java.util.*;
class Exercise3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [2][4];
		System.out.println("Enter the elements of the 2 X 4 array");
		for(int i=0;i<2;i++)
			for(int j=0;j<4;j++)
				arr[i][j] = sc.nextInt();
		System.out.println("Printing the elements of the array");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
	}
}
