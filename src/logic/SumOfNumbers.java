package logic;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 123456789;
		int sum = String.valueOf(a)
		.chars()
		.map(Character::getNumericValue)
		.sum();
System.out.println(sum);
	}

}
