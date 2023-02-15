//Allow a variable to be tested for equality against a list of values
//Better than using many if statements

public class Switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Pizza";
		
		switch(day) {
			case "Sunday": System.out.println("It is Sunday!"); //What to print if there is a match
			break; //Breaks switch to prevent printing every case
			
			case "Monday": System.out.println("It is Monday!"); //What to print if there is a match
			break;
			
			case "Tuesday": System.out.println("It is Tuesday!"); //What to print if there is a match
			break;
			
			case "Wednesday": System.out.println("It is Wednesday!"); //What to print if there is a match
			break;
			
			case "Thursday": System.out.println("It is Thursday!"); //What to print if there is a match
			break;
			
			case "Friday": System.out.println("It is Friday!"); //What to print if there is a match
			break;
			
			case "Saturday": System.out.println("It is Saturday!"); //What to print if there is a match
			break;
			
			default:System.out.println("It is not a day!"); //If the variable does not match any case
		}

	}

}
