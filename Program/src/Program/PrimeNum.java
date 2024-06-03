package Program;

public class PrimeNum {
public static void main(String args[])
{
	int num = 11;
	if(num<=1) {
		System.out.println(+num+" is not a prime number");
	}
	else
	{
    boolean flag = false;
    for (int i = 2; i <= Math.sqrt(num); ++i) {
  
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (flag==false)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
}