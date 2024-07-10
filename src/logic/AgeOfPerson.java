package logic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeOfPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date= LocalDate.of(1987, 10, 10);
		LocalDate now =LocalDate.now();
		long between = ChronoUnit.YEARS.between(date,now);
		System.out.println(between);

	}

}
