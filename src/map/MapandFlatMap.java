package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapandFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> al=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
		
		List<Integer> collect = al.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
