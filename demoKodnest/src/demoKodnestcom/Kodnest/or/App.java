package demoKodnestcom.Kodnest.or;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		System.out.println("Original Number=" +num);
		modify(num);
		System.out.println("Number after executing modify() "+num);
	}
	static void modify(int numcopy) {
		System.out.println("Original Number copy modification " +numcopy);
		numcopy=100;
		System.out.println("Number copy after modifications "+numcopy);
	}

}
