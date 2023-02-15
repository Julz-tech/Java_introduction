
public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EQUAL METHOD - Comparing if 2 strings are equal:
		
		String name = "      Julia   ";
		/*boolean result = name.equals("Julia"); //Return T or F. CASE SENSITIVE
		System.out.println(result);
		
		String names = "julia";
		boolean answer = names.equalsIgnoreCase("Julia"); //NOT CASE SENSITIVE
		System.out.println(answer);
		*/
		//LENGTH METHOD - return length of string
		int result = name.length();
		System.out.println(result);
		
		//Accessing character in a string
		char results = name.charAt(0);
		System.out.println(results);
		
		//Accessing index of character in a string
		int resultss = name.indexOf("a");
		System.out.println(resultss);
		
		//Check if string is empty
		boolean resultsss = name.isEmpty();
		System.out.println(resultsss);
		
		
		
		//Change characters in a string to uppercase
		String resultssss = name.toUpperCase();
		System.out.println(resultssss);
		
		//Change to lower case
		String resultsssss = name.toLowerCase();
		System.out.println(resultsssss);
		
		//Remove empty spaces
		String resultssssss = name.trim();
		System.out.println(resultssssss);
		
		//Replacement method
		String resultsssssss = name.replace("J", "H"); //old character then replacement character
		System.out.println(resultsssssss);
	}

}
