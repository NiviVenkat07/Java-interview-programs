package Repitative_Words;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repitative {
public static void main(String[] args) {
	
	            // immutable
	
String S = "of the people by the people for the people";

String[] Words = S.split("");   

	Map<String,Integer> map = new LinkedHashMap<String, Integer>();     //upcasting
	
	for (String word: Words) {
		if (map.containsKey(word)) {
			
			Integer value = map.get(word);
		map.put(word,value+1);
		}
		else {
			map.put(word, 1);
		}				
	}
	
	System.out.println(map);
	
	//to itterate map 
	
	Set<Entry<String, Integer>> entrySet = map.entrySet();
	
    for (Entry<String, Integer> entry : entrySet) {
		
		if (entry.getValue()>1) {
			
			System.out.println(entry);
			
		}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
}