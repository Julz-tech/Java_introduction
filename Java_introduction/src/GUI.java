import javax.swing.JFrame;
import javax.swing.ImageIcon; 
import java.awt.Color;
//Java Graphical User Interface
//JFrame = GUI window to add components to
public class GUI {

	public static void main(String[] args) {
		// How to create a frame:
		JFrame frame = new JFrame(); //This creates an instance of a frame
		frame.setTitle("JFrame title goes here"); //sets title of rame
		frame.setSize(420, 420); //Sets width and length of frame
		frame.setVisible(true); //make frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*closes program when we press close button
		by default, the program is just hidden 
		Other options include:
		*HIDE_ON_CLOSE
		*DO_NOTHING_ON_CLOSE*/
		frame.setResizable(true); //enables user to resize window
		ImageIcon image = new ImageIcon("logo.jfif");//create image icon
		//N/B: place image in project folder or provide path
		frame.setIconImage(image.getImage());//change icon at the top of the frame
		frame.getContentPane().setBackground(Color.black);//Change background colour of window
		//
	}

}
