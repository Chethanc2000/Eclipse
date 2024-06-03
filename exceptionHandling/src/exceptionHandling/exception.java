package exceptionHandling;

public class exception {
	public static void main(String[] args) {
		try {
		System.out.println(3/0);
	} catch(Exception e) {
		System.out.println("Denominator should be +ve number");
	}
		finally {
			System.out.println("Close");
		}

}
}
