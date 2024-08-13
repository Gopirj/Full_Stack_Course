 import java.util.Scanner;

public class Sample1
{
	public static void main(String args [])
	{
		int size;
		
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter size of array");
		size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();	
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];	
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);	
		}
		System.out.println(sum);	
		}
	}