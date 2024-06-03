package Program;
public class Prg1 {

	public static void main(String args[])
	{
		int n=10,t1=0,t2=1;
		System.out.println("Fibonacci Series of"+n+"terms are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(t1+",");
			
			int tn=t1+t2;
			t1=t2;
			t2=tn;
		}
		
		
	}
	}

