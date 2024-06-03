package Program;

public class PalindromeString {
public static void main(String args[]) {
	String str = "CIVIC";
	String revstr = "";
	char ch;
	for(int i=0;i<str.length();i++) 
	{
		ch = str.charAt(i);
		revstr = ch + revstr;
	}
	System.out.println("The reverse of "+str +" is: "+revstr);
	if(str.equals(revstr)) {
	System.out.println("The string is a palindrome");
	}
	else
		System.out.println("It is not");
}
}
