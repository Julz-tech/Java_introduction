//Making a simple GUI application:
import javax.swing.JOptionPane; //enables user input into a dialogue bo x 

public class MyFirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name); //null = first argument
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		//Above class converts string to integer since the dialogue box displays strings only
		JOptionPane.showMessageDialog(null, "You are " + age + " Years old");
		//double.parseDouble = convert to double
	}

}
