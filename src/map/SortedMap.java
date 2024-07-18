package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SortedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sainath");
		map.put(3, "shreyansh");
		map.put(5, "zaheer");
		map.put(4, "pranvi");
		map.put(2, "saritha");

		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		// map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		List<String> asList = Arrays.asList("sainath", "prasad", "sravani", "hyderabad");

		String string = asList.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
		System.out.println(string);

		String s = " sainath prasad springbootapi saisha hyderbad ";
		String[] split = s.split(" ");
		String string2 = Arrays.stream(split).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
		System.out.println(string2);

	}

}
