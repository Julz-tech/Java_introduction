//Stores multiple values in a single variable 
//all values must be the same data types, e.g., strings only

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Camero", "Ferrari", "Corvette", "comet"};

		//Accessed via elements, starting from 0:
		cars[0] = "Mustang"; //replaces element 0
		
		System.out.println(cars[0]);
		
		//Method 2 of creating arrays:
		String[] vehicles = new String[4];
		vehicles[0] = "Camero";
		vehicles[1] = "Ferrari";
		vehicles[2] = "Corvette";
		vehicles[3] = "comet";
				
		System.out.println(vehicles[2]);
		
		//Using a for loop to iterate an array
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		//i will begin at 0 and increase with one until max length of array is reached
		}
		}
	}
