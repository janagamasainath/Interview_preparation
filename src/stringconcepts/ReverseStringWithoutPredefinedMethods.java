package stringconcepts;

public class ReverseStringWithoutPredefinedMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello i am preparing for java interview";
		//output : olleh i ma gniraperp rof avaj weivretni
		
		//Step 3
		ReverseStringWithoutPredefinedMethods reverseword= new ReverseStringWithoutPredefinedMethods();
		String reverseWord2 = reverseword.reverseWord(str);
      System.out.println(reverseWord2);
	}

	//Step 1
	public String revrse(String word) {
		char[] charArray = word.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		return new String(charArray);

	}
	
	//Step 2
  public String reverseWord(String str) {
	String[] split = str.split(" ");
	StringBuilder builder= new StringBuilder();
	for (String words : split) {
		builder.append(revrse(words)).append(" ");
	}
	return builder.toString().trim();
	
}

}
