package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapandFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, List<Integer>> map = new HashMap<>();
		map.put(1,Arrays.asList(111,222,333,444,555,666));
		map.put(2, Arrays.asList(1,2,3,4,5,6));
		map.put(3, Arrays.asList(11,22,33,44,55,66));
		for(Map.Entry<Integer, List<Integer>> mm: map.entrySet()) {
			Integer key = mm.getKey();
			List<Integer> value = mm.getValue();
			System.out.println(mm);
		}
		
		

	}

}
