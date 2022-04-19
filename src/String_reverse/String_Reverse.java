package String_reverse;

public class String_Reverse {

	//Using for loop String is an mutable.
	
	public static void main (String[]args) {
	
		String S = "String value change to reverse";
	
	String reverse = "";
	
	int length =S.length();
	System.out.println(length);
     
	for (int i = length-1; i >= 0; i--) {
	
	char C	= S.charAt(i);
		
	reverse= reverse+C;
	
}
	System.out.println(reverse);
	
	
}
	
	
}