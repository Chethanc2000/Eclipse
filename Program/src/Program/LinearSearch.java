package Program;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int n=6;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println(n +" found at index " +i +" in array");
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Number not found in array");
		}
	}

}
