package logic;

import java.util.Arrays;

public class SumOfAllNumbersInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		

	}

}
