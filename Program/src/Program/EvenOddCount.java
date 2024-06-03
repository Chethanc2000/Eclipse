package Program;

public class EvenOddCount {

	public static void main(String[] args) {
		int num=123456789;
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("The number of even numbers in "+num +" are: " +evencount);
		System.out.println("The number of odd numbers in "+num +" are: " +oddcount);

	}

}
