package main;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sainath";
		long count = Arrays.stream(s.split("")).count();
		long count2 = s.chars().count();
		System.out.println(count);
		System.out.println(count2);
		Map<String, Long> collect = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		// Replace 123 instead if a 
		StringBuilder sb = new StringBuilder();
		String str = "hello i am sainath";
		int c = 1;
		char[] charArray = str.toCharArray();
		for (char sss : charArray) {
			if (sss == 'a') {

				sb.append(c);
				c++;
			} else {
				sb.append(sss);
			}
		}
		String re = sb.toString();
	
	   int c1=1;
	   for (char d : re.toCharArray()) {
		if (d=='s') {
			sb.append(c1);
			c1++;
		}
		else {
			sb.append(d);
		}
	   }
			String result = re.toString();
			System.out.println(result);
		}
	

}
