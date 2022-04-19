package Repitative_Words;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetative_words {
    public static void main(String[] args) {
	
		String S = "For the people by the people of the people ";
			 
		 String [] split = S.split(" ");
			 
		 Map <String,Integer> map = new HashMap<>();
		for (String str : split) {
		if (map.containsKey(str)) {
			 
			Integer i =map.get(str);
			
			map.put(str, i+1);
		}	
		else {
			map.put(str, 1);
		}
			
		}
		
		System.out.println(map);
		
			
		Set <Entry <String,Integer>> entryset = map.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue()>1) {
			System.out.println(entry);
			}
		}
		
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
         		
        	
        	
		}
         
}       
    	
    	
    	
    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

