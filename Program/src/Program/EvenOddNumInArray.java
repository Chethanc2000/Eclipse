package Program;

import java.util.Scanner;

public class EvenOddNumInArray {

	public static void main(String[] args) {
		System.out.println("Enter the number of array elements: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();	
		}
		System.out.println("Even numbers in array");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(+arr[i]);

			}
			
		}
		System.out.println("Odd numbers in array");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(+arr[i]);

			}
			
		}
		sc.close();
	}

}
