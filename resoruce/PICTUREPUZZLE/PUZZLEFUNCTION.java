package PICTUREPUZZLE;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PUZZLEFUNCTION 
{

    private static int count = 0; // to count how many times the button has been clicked
 
    

	public static void hint() {
		
		if(count<1) {            // checks if  button is already clicked if not then display next frame
	 JFrame hint = new JFrame();  // creates a new frame
  	 hint.setTitle("HINT");       // called hint
  	 hint.setSize(500,500);       // sets size
  	 hint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	JPanel panel = new JPanel(new FlowLayout());
  	hint.add(panel);
  	
    JLabel label = new JLabel(new ImageIcon("C:\\Users\\zsoha\\Downloads\\puzpic.jpg")); // adds the puzzle image to label
    hint.add(label);                  // label is added to frame
    hint.setVisible(true);            // it is made visible
    count++;                          // counter is increased and becomes one
  	
		}
		 
  	 
	}
	
	
	public static void endgame()     // new method
	{
		JOptionPane endgame = new JOptionPane();   // creates option pane 
		
		JOptionPane.showMessageDialog(null,"CONGRULATIONS");  // displays congrualtion
		
	}
}
