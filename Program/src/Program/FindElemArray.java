package Program;

public class FindElemArray {

	public static void main(String[] args) {
		int num=30;
		boolean flag=false;
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				System.out.println(num +" is found at index " +i +" of array");
				flag=true;
			}
		}
		if (flag==false)
		{
			System.out.println(num +" Not found in array");
		}

	}

}
