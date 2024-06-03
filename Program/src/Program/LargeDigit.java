package Program;

public class LargeDigit {

	public static void main(String[] args) {
		
		int num=2365,large=0;
		while(num!=0)
		{
			int digit=num%10;
			if(digit>large)
			{
				large=digit;
			}
			num=num/10;
		}
		System.out.println("The largest digit of the number is :"+large);
	}

}
