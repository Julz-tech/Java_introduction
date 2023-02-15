//Generating random numbers on Java
//Class to be imported = random:
import java.util.Random;


public class Random_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instance of the class must be named after the class
		//e.g., Random instance named after Random class
		Random random = new Random();
		
		//Generate a random integer x:
		int x = random.nextInt();
		
		System.out.println(x);
		//N/B: integers run from -2 Billion - 2 billion
		//We can reduce the range by adding a number:
		
		int y = random.nextInt(6);
		//This will generate a random number between 0 - 5
		System.out.println(y);
		
		//To get a random number between 1 and 6:
		int z = random.nextInt(6) + 1;
		System.out.println(z);
		
		//Other types:
		double a = random.nextDouble();
		boolean b = random.nextBoolean();
		



	}

}
