package Program;

public class ArrSortedOrNot {
	
	static boolean SortedArrayOrNot(int arr[],int n)
	{
		if (n<=1)
		{
		return true;
		}
		for(int i=1;i<n;i++)
		{
			if(arr[i-1]>arr[i])
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int arr[]= {10,30,20,40,50};
		int n=arr.length;
		if(SortedArrayOrNot(arr,n))
		{
			System.out.println("The array is sorted");
		}
		else
		{
			System.out.println("The array is not sorted");
		}
	
	

	}

}
