package Program;
public class ptrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	        int n = 5;  // Number of rows for the pattern

	        for (int i = 1; i <= n; i++) {

	            // Print alternating '*' and '#'

	            for (int j = 1; j <= i; j++) {

	                if (j % 2 == 1)

	                    System.out.print("*");

	                else

	                    System.out.print("#");

	            }

	            // Print '?' at the end of each row

	            System.out.print("?");

	            System.out.println();

	        }

	}

}
