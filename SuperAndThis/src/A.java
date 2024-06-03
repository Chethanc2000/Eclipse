
public class A {

	int a;
	String b;
	public A(){
		System.out.println("1");
	}
	public A(int a) {
		this("ss",4);
		System.out.println("2");
	}
	public A(String b) {
		this();
		System.out.println("3");
	}
	public A(int a, String b) {
		this(19);
		System.out.println("4");
	}
	public A(String b, int a) {
		this("S");
		System.out.println("5");
		
	}
	

}
