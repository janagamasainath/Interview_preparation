package main;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringToIntansIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sainath";
		long count = s.chars().count();

		String collect = s.chars().sorted().mapToObj(c -> (char) c).map(String::valueOf).collect(Collectors.joining());

		System.out.println(count);
		System.out.println(collect);

		String str = "janagama sainath";
		String collect2 = Arrays.stream(str.split(" ")).map(word -> String.valueOf(word.charAt(0)))
				.collect(Collectors.joining());

		System.out.println(collect2);
		
		Stream<String> stream = Arrays.stream(str.split(" "));
		Optional<String> first = stream.findFirst();
		System.out.println(first+"===========");
		str.indexOf(0);
		str.lastIndexOf(3);
		String substring = str.substring(str.indexOf(1) , str.lastIndexOf(3)).toString();
		System.out.println(substring);
	}

}
