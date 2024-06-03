package Program;

public class PrimeNum1to100 {
public static void main(String args[])
{
	for(int num=2;num<=100;num++)
	{
    boolean flag = false;
    for (int i = 2; i <= Math.sqrt(num); ++i) {
  
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
	
    if (flag==false)
      System.out.print(num+" ");
   
	}
}
}