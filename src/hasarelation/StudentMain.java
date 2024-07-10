package hasarelation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> student = new ArrayList<>();
		student.add(new Student("sainath", Arrays.asList("java","springboot","microservices"),25 , new Address("acolony", "hyderabaad", "telangena"),5));
		student.add(new Student("arun", Arrays.asList("autocad","sap","testing"),26 , new Address("bcolony", "secunderabad", "telangena"),4));
		student.add(new Student("praveen", Arrays.asList("testing","sql","postgres","mysql"),24 , new Address("ccolony", "khamam", "telangena"),5));
		student.add(new Student("zaheer", Arrays.asList("angular","jsp","java","react"),25 , new Address("dcolony", "hyderabaad", "telangena"),3));
		student.add(new Student("shreyansh", Arrays.asList("java","springboot","react","angular"),21 , new Address("ecolony", "secunderabad", "telangena"),1));
		student.add(new Student("devansh", Arrays.asList("java","springboot","microservices","testing"),21 , new Address("acolony", "secunderabad", "telangena"),4));
		student.add(new Student("shiva", Arrays.asList("java","springboot","sql","mysql"),22, new Address("hcolony", "warangal", "telangena"),8));
		student.add(new Student("pruthvi", Arrays.asList("sql","postgres","react"),25 , new Address("icolony", "hyderabaad", "telangena"),1));
		
		//sort the student those who know microservices and they are from hyderabad
		List<Student> collect = student.stream().filter((s->s.getCourses().contains("sql"))).collect(Collectors.toList());
		List<Student> collect2 = collect.stream().filter(a->a.getAddress().getCity().equals("hyderabaad")).collect(Collectors.toList());
		System.out.println(collect2);
		
		//getting students who know springboot and Microservices and belongs to state telangana and experience >=5
	List<String>	springbootandMicroservices=Arrays.asList("springboot","microservices");
    List<Student> collect3 = student.stream().filter(a->a.getCourses().containsAll(springbootandMicroservices)).collect(Collectors.toList());
    List<Student> collect4 = collect3.stream().filter(s->s.getAddress().getState().equals("telangena")).collect(Collectors.toList());
    List<Student> collect5 = collect4.stream().filter(a->a.getExperience()>=5).collect(Collectors.toList());
    System.out.println(collect5);
	}

}
