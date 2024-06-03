package Program;

public class MaxMinArray {

	public static void main(String[] args) {
		int a[]= {4,1000,20,20,30,400};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The maximum number in array is : "+max);
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The maximum number in array is : "+min);
		
	}

}
