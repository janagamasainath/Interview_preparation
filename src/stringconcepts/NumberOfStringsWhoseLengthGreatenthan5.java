package stringconcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfStringsWhoseLengthGreatenthan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sai nath jhow are you i am feeling well microservices sai but sai springboot ";
		List<String> collect = Arrays.stream(str.split(" ")).filter(a->a.length()>5).collect(Collectors.toList());
		String string = Arrays.stream(str.split(" ")).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
		System.out.println(collect);
		System.out.println(string);

	}

}
