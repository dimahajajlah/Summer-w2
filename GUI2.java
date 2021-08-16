
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class GUI2 {

	 public static void main(String[] args) {

	  // JFrame = a GUI window to add components to
	  
	  JFrame frame = new JFrame(); //creates a frame
	  frame.setTitle("JFrame title goes here"); //sets title of frame
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
	  frame.setResizable(false); //prevent frame from being resized
	  frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
	  frame.setVisible(true); //make frame visible
	  
	  ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
	  frame.setIconImage(image.getImage()); //change icon of frame
	  frame.getContentPane().setBackground(new Color(0x123456)); //change color of background
	    

		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image2 = new ImageIcon("dude.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); //create a label
		label.setText("bro, do you even code?"); //set text of label
		label.setIcon(image2);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); //set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,100)); //set font of text
		label.setIconTextGap(-25); //set gap of text to image
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //display background color
		//label.setBorder(border); //sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
		//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
			
		//JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);	 
		frame.add(label);
		frame.pack();

	  
	 }
}
