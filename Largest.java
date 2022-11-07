import java.util.*;
class Largest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		arr[i]= sc.nextInt();
		int max = arr[0];
		for(int i=1;i<n;i++)
		{
			if(max<arr[i])
			max = arr[i];
		}
		System.out.println("The larget number is "+max);
		sc.close();
	}
}
