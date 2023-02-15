//AKA multi-dimensional arrays
//Have rows and columns

public class Arrays_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String [][] cars = new String [3][3]; //row then column
		
		cars [0][0] = "Camero"; //row 0, column0
		cars [0][1] = "Corvette";
		cars [0][2] = "Ferrari";
		cars [1][0] = "Tesla";//row 1, column 0
		cars [1][1] = "Range rover";
		cars [1][2] = "Porsche";
		cars [2][0] = "Rolls Royce";//row 2, column 0
		cars [2][1] = "Toyota";
		cars [2][2] = "Bugatti";
		
		//Let's display all elements in the array
		
			
		for(int i=0; i<cars.length; i++) {
		System.out.println();
		for(int j = 0; j<cars[i].length; j++) {
		System.out.print(cars[i][j]+" ");
		}
		*/
		
		//Method 2:
		String[][] cars = {
				{"Camaro", "Corvette", "Silverado"},
				{"Mustang", "Ranger", "F-150"},
				{"Ferrari", "Lambo", "Tesla"}
				};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j = 0; j<cars[i].length; j++) {
			System.out.print(cars[i][j]+" ");
			}
	}

}
}
