//Provides a way to use primitive data types as reference data types
public class Wrapper_class {

	public static void main(String[] args) {
		//Reference data types contain useful methods
		//Reference data types can be used with collections (ex. ArrayList)
		//slower to access (disadvantage)
		//primitive //wrapper
		//-----    //-------
		// boolean   Boolean
		// char      Character
		// int 		 Integer
		// double 	 Double
		
		//Accessing values in a wrapper class
		// autoboxing = the automatic conversion of primitive data type to wrapper class
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 12.50;
		String e = "Bro"; //strings are reference data types hence always start with a capital
		a.booleanValue();
		
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		if(a==true) {
			System.out.println("This is true");
			}
		//This will now behave like a primitive data type
	}

}
