package logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllNumbersInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of all numbers
		int sum = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		//multiply of each number
		List<Integer> collect = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(collect);
		

	}

}
