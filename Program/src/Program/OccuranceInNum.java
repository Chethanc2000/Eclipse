package Program;

public class OccuranceInNum {

	public static void main(String[] args) {
		int num=1232233424;
		int n=1;
		int count=0;
		while(num!=0)
		{
			int rem=num%10;
			if(n==rem)
			{
				count++;
			}
			num=num/10;
			
		}
		System.out.println("The number of occurences of "+n +" is " +count);
	

	}

}
