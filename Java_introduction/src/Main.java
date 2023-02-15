//Import scanner class:
import java.util.Scanner; //allows user input
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello"); //print on separate line
		System.out.print("Hello"); //print on same line
		System.out.print("\"Hello\""); //print in quotes
		// TODO Auto-generated method stub
		/*Java Data types: Primitive vs Reference (All are primitive (stores data) except string 
		 * which is reference (stores address))
		 * Boolean = True/ False
		 * Str = string e.g., "Hello"
		 * char = character e.g., '@'
		 * double = decimal upto 15 digits
		 * float = decimal with 6 - 7 digits
		 * int = integer (-2 billion - 2 billion)
		 * byte = integer (-128 - 127)
		 */
		int x = 2;
		System.out.print(x);
		System.out.println("1 + 1 = " + x);
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("Hello "+name + "!");
		
		System.out.println("What would you like to eat today?");
		String food = scanner.nextLine();
		System.out.println("Your Favourite food is " + food);
		
		scanner.close();
		
		/*Expressions: operands and operators:
		 * Operands = values, variables, numbers, quantity
		 * Operators = +, -, *, /, %
		 * ++: adds 1 to a value
		 * --: subtracts 1 from a value
		 */
		
		double friends = 10;
		friends = friends + 1;
		System.out.println(friends);
		
		//Convert data types, e.g., convert double to float:
		friends = (float) friends / 2;
		System.out.println(friends);
		
		

	}

}
