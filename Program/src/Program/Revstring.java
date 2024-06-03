package Program;

public class Revstring {
public static void main(String args[]) {
	String str = "CHETHAN";
	String revstr = "";
	char ch;
	for(int i=0;i<str.length();i++) 
	{
		ch = str.charAt(i);
		revstr = ch + revstr;
	}
	System.out.println("The reverse of "+str +" is: "+revstr);
}
}
