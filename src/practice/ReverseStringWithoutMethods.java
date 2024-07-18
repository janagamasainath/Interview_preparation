package practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringWithoutMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= " hello sainath how are you";
		
		char[] charArray = str.toCharArray();
		for (int i = charArray.length-1;i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		
		ReverseStringWithoutMethods p = new ReverseStringWithoutMethods();
		String reverseString = p.reverseString(str);
		//System.out.println(reverseString);
		
		
		
		
		
	}
	//step1 
	public String reverse(String str) {
		char[] charArray = str.toCharArray();
		int left=0;
		int right= charArray.length-1;
		if (left <  right) {
			char temp = charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
			
		}
		return new String(charArray);
		
	}
	
	//step 2
	
	public String reverseString(String str) {
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : split) {
			sb.append(reverse(word)).append(" ");
		}
		
		return sb.toString().trim();
		
		
	}

	

}
