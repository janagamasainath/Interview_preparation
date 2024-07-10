package stringconcepts;

import java.util.Arrays;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"java","springboot","microservices","Angular","hibernate","restApi"};
		
		String longestString = Arrays.stream(str).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
		System.out.println(longestString);

	}

}
