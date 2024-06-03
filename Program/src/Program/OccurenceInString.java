package Program;

public class OccurenceInString {

	public static void main(String[] args) {
		String str = "Hello";
		char c='l';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(c==str.charAt(i))
			{
			count++;
			}
		}
		
System.out.println("Number of occurance of "+c +" in "+str +" is: " + count);
	}

}
