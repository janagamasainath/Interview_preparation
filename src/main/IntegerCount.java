package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 12345678;
		String valueof;
		int sum = String.valueOf(a).chars().map(Character::getNumericValue).sum();
		System.out.println(sum);
		valueof = String.valueOf(a); 
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sainath");
		map.put(2, "arun");
		map.put(3, "zaheer");
		map.put(4, "praveen");
		 Map<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey , (e1,e2)->e1));
		 Map<String, Integer> collect2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()) .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (e1, e2) -> e1));
		 System.out.println(collect);
		 
		
		
		 int sum2 = String.valueOf(a).chars().map(Character::getNumericValue).sum();
		 System.out.println(sum2);
	}

}
