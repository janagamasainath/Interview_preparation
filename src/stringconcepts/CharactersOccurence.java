package stringconcepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello i am a java developer"; //creating String literal
		
		//using java 8 
		Map<String, Long> collect = Arrays.stream(str.split("")) //converting to stream and spliting String into individual charactes
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // grouping based on individual characters and counting each 
		
		System.out.println(collect);
		
		// using java 1.7
		char[] charArray = str.toCharArray(); // converting into individual character
		Map<Character, Integer> map= new HashMap<>(); // creating map object key=character & value =Integer
		for (char ch : charArray) {    
			if (map.containsKey(ch)) {    
				map.put(ch,map.get(ch)+1);  
			}else {
				map.put(ch,1);
			}
		}
		
		//System.out.println(map);
		
	}

}
