package String_reverse;

public class String_rev_1 {

	public static void main(String[] args) {
		
		String S = "String Reverse Program ";
		String S1 = " ";
		String TC =S.toUpperCase();// all letters to chane upper case
		String LC = S.toLowerCase();
	
		
		int l =S.length();
		System.out.println(l);
		
		for (int i = S.length()-1;i >=0; i--) {     // string itterate the values
			
			
         char C = S.charAt(i);       // CharAt print the letters		
			
			S1=S1+C;   
			TC = TC+S.charAt(i);
			LC = LC +S.charAt(i);
			
			
		}
		System.out.println(S1);
		System.out.println(TC);
		System.out.println(LC);

		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
