//And, Or, Not
//Check if two or more conditions are true

import java.util.Scanner;
public class Logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AND == &&: both statements must be true
		int temp = 25;
		if(temp > 30) {System.out.println("It is hot outside");
		
		}
		
		else if(temp >= 20 && temp <= 30) {System.out.println("It is warm outside!");
		
		}
		
		else {
			System.out.println("It is cold outside!");
		}

	//OR == ||: At least one statement must be true:
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Are you sure you would like quit? Press q or Q to quit. Press any other key to resume.");
		
		String response = scanner.next();
		
		/*
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("Good bye! See you soon!");
		
		}
		
		else {
			System.out.println("You are still playing the game!");
		
		}
		**/
		
		
	//NOT == !: reverses boolean value of a condition
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still playing the game!");
		}
		
		else {
			System.out.println("Good bye! See you soon!");
			
			}
		
		scanner.close();
		
	}

}
