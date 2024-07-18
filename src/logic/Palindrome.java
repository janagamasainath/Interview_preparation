package logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {

		String str = "ABCDCBA";

		String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

		if (cleanedStr.equals(reversedStr)) {
			System.out.println(str + " is palindrome");

		} else {
			System.out.println(str + " is not a palindrome");
		}
		
		int a=1234321;
	     String valueOf = String.valueOf(a).toString();
	     String s = new StringBuilder(valueOf).toString();
	     if (s.equals(a)) {
			System.out.println(a+" is palimdrome");
		}else {
			System.out.println(a+"  not palimdrome");
		}
	     int[] aa= {1,2,3,5,7,11,23,15,46};
	     List<String> collect = Arrays.stream(aa).boxed().map(sss->sss+"").filter(cc->cc.startsWith("1")).collect(Collectors.toList());
	     System.out.println(collect);
	     
	     

	}
}