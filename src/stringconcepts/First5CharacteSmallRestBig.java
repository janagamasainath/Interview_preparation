package stringconcepts;

public class First5CharacteSmallRestBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "SainatHJANAGAMA";
	        StringBuilder output = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (i < 5) {
	                output.append(Character.toLowerCase(ch));
	            } else {
	                output.append(Character.toUpperCase(ch));
	            }
	        }

	        System.out.println("Output: " + output.toString());
	    }



	}


