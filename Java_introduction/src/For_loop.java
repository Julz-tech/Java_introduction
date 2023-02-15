//Executes a block of code as long as the condition remains true

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		//While loop: can be infinite as long as condition is met
		/*
		while(name.isBlank()) {
			System.out.println("Enter your name:");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
		*/
		
		//Do loop:
		//Performs block of code then checks condition
		/*
		do{
			System.out.println("Enter your name:");
			name = scanner.nextLine();
		} while(name.isBlank());
		
		System.out.println("Hello " + name);
		*/
		
		//For loop: Executes a block of code a limited amount of times
		for(int i = 8; i <= 10; i++) {
			System.out.println(i);
		}
		//This will start counting at given number and add 1 each time until it reaches 10
		
		for(int y = 3; y > 0; y--) {
			System.out.println(y);
		}
		//This will count down by 1 and not include 0
		
		System.out.println("Happy new year!");
		
		
		for(int z = 4; z >= 0; z-=2) {
			System.out.println(z);
		}
		//This will count down by 2 and not include 0
		
		System.out.println("Happy new year!");
		
		scanner.close();
	}

}
