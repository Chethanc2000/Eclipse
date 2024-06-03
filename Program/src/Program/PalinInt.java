package Program;
public class PalinInt{
	public static void main(String args[])
	{
		int num=1001,rev=0;
		int originalnum = num;
		while(num!=0) 
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(originalnum==rev)
		{
			System.out.println(+ originalnum +" is a palindrome");
		}
		else
		{
			System.out.println(+originalnum+" is not a palindrome");
		}
	}
}