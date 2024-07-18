package employee;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="Janagama sainath";
 Map<String, Long> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
 System.out.println(collect);
 String collect2 = Arrays.stream(s.split(" ")).map(word->String.valueOf(word.charAt(0))).collect(Collectors.joining());
 System.out.println(collect2);

 
 
 
 
	}

}
