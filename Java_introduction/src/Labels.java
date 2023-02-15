import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

//JLabel = GUI display area for text, image or both
public class Labels {

	public static void main(String[] args) {
		
		JLabel label = new JLabel(); //This creates an instance of a frame
		label.setText("My first JLabel"); //sets text of JLabel
		label.setHorizontalTextPosition(JLabel.CENTER);//set label position
		//Label positions can be left, centre or right
		label.setVerticalTextPosition(JLabel.TOP);//set label vertical position
		//Vertical position can be top, centre or bottom
		
		label.setVerticalAlignment(JLabel.TOP);//set vertical position of text +icon
		label.setHorizontalAlignment(JLabel.CENTER);
		
		label.setBackground(Color.black); //set background color
		label.setOpaque(true);//enables display of background color
		//Changing font:
		label.setForeground(Color.BLUE); //set font colour
		label.setFont(new Font("MV Boli",Font.BOLD, 20));//set font type. 20 = font size
		
		ImageIcon image = new ImageIcon("logo.jfif");//create image icon
		label.setIcon(image);//Set icon to label
		label.setIconTextGap(-5); //Set gap between text and icon
		
		//Create a frame:
		JFrame frame = new JFrame();
		frame.add(label);//Add label to frame
		frame.setSize(420, 420); //Sets width and length of label
		frame.setVisible(true); //make label visible
		
		//setting coordinates of the label and icon:
		frame.setLayout(null);
		label.setBounds(0, 0, 250, 250); //0,0 = coordinates, 250,250 = size of label
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		//Set border colors
		 Border border = BorderFactory.createLineBorder(Color.green,5); //set color and thickness
		 label.setBorder(border);
		 
		 //frame.add(label);
		 //frame.pack(); //enable label to adjust with frame size. Must comment out coordinates
	}

}
