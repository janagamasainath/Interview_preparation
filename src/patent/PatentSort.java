package patent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Patent> list = new ArrayList<>();
		list.add(new Patent("jhon", Arrays.asList("corona", "feaver", "cold"), 22, "TS", 35000.00));
		list.add(new Patent("maxi", Arrays.asList("corona"), 20, "DL", 22000.00));
		list.add(new Patent("tom", Arrays.asList("cold", "feaver"), 21, "TS", 33000.00));
		list.add(new Patent("jack", Arrays.asList("headache", "feaver"), 22, "MP", 31000.00));
		list.add(new Patent("toni", Arrays.asList("cold", "cough"), 20, "AP", 22000.00));
		list.add(new Patent("james", Arrays.asList("cough", "feaver"), 21, "UP", 35000.00));

		// list of patents suffering with cold
		List<Patent> collect = list.stream()
				.filter(patent -> patent.getDiseases().contains("cold"))
				.collect(Collectors.toList());

		// list of patents belongs to state "UP"
		List<Patent> collect2 = list.stream()
				.filter(patent -> patent.getState().equals("UP"))
				.collect(Collectors.toList());

		// Grouping based on state
		Map<String, List<Patent>> collect3 = list.stream()
				.collect(Collectors.groupingBy(patent -> patent.getState()));

		// Providing 20% discount to the state "TS"
		list.stream().filter(patent -> patent.getState().equals("TS"))
				.forEach(p -> p.setBillAmount(p.getBillAmount() * 0.8));
		//list.forEach(System.out::println);
		
		
		//providing 20% dicount for corona patents
		list.stream().filter(patent->patent.getDiseases().contains("corona")).forEach(patent->patent.setBillAmount(patent.getBillAmount()*0.8));
		list.forEach(System.out::println);
		

	}

}
