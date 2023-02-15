//Loop inside another loop
import java.util.Scanner;

public class Nested_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lets's create a table using symbols
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows:");
		rows = scanner.nextInt();
		
		System.out.println("Enter # of columns:");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol to use");
		symbol = scanner.next(); //stores token until a symbol is pressed
		
		//Outer for loop is in charge of rows
		//inner for loop is in charge of columns
		
		for(int i=1;i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
			System.out.print (symbol);
		
		scanner.close();
			}	
	}
	}
	

}
