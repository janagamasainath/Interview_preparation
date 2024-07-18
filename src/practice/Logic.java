package practice;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		String s ="sainath";


		Logic a = new  Logic();
		String reverse = a.reverse(s);
		System.out.println(reverse);
		
		
		
		

	}
	
	//step 1
	
	public String reverseString(String message) {
		
		char[] charArray = message.toCharArray();
		int left=0;
		int right= charArray.length-1;
		if (left < right) {
			
			char temp = charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		
		return new String(charArray);
		
	}
	
	//step2 
	public String reverse(String message) {
		String[] split = message.split(" ");
		StringBuilder ss= new StringBuilder();
		for(String word: split ) {
			
			ss.append(reverseString(message)).append(" ");
		}
		return ss.toString().trim();
		
		
	}

}
