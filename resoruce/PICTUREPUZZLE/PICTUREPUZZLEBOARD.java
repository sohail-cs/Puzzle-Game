package PICTUREPUZZLE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PICTUREPUZZLEBOARD {
	
	public static   LinkedList<PICTUREPUZZLEPIECES> pieces =new LinkedList<>();
	public static boolean NextPieceReady = true;
	public static PICTUREPUZZLEPIECES selectedPiece = null; // selected piece variable
	public static PICTUREPUZZLEPIECES random = null;  
	public static PICTUREPUZZLEPIECES temp = null;
	public static boolean randomAgain = false;
	public static int counter = 55;
	
	public static void main(String[] args) throws IOException 
	{
		                                          // Adds image 
		BufferedImage all=ImageIO.read(new File("C:\\Users\\zsoha\\eclipse-workspace\\JAVA SUMMER PROJECT\\src\\puzpic.jpg"));
		   
		   Image img[]=new Image[100];            // An array to store all  100 puzzle pieces parts 
	       int i=0;                               //to count index of those parts
	        
	        for(int y=0;y<1000;y+=100)             // loop to iterate over the columns of sub images 
	        {
	        	for(int x=0;x<1000;x+=100)          // loop to iterate over the rows of sub images dividing subimages into 100x100 pixels
	        	{
	        		img[i]=all.getSubimage(x, y, 100, 100).getScaledInstance(50, 50, BufferedImage.SCALE_SMOOTH);
	        		i++;
	        	}    
	        } 
		
	           //adding the puzzle pieces to the first column
	        PICTUREPUZZLEPIECES piece0 =new PICTUREPUZZLEPIECES(0,0,0,pieces);
	        PICTUREPUZZLEPIECES piece1 = new PICTUREPUZZLEPIECES(1,1,0,pieces);
	        PICTUREPUZZLEPIECES piece2 = new PICTUREPUZZLEPIECES(2,2,0,pieces);
	        PICTUREPUZZLEPIECES piece3 = new PICTUREPUZZLEPIECES(3,3,0,pieces);
	        PICTUREPUZZLEPIECES piece4 = new PICTUREPUZZLEPIECES(4,4,0,pieces);
	        PICTUREPUZZLEPIECES piece5 = new PICTUREPUZZLEPIECES(5,5,0,pieces);
	        PICTUREPUZZLEPIECES piece6 = new PICTUREPUZZLEPIECES(6,6,0,pieces);
	        PICTUREPUZZLEPIECES piece7 = new PICTUREPUZZLEPIECES(7,7,0,pieces);
	        PICTUREPUZZLEPIECES piece8 = new PICTUREPUZZLEPIECES(8,8,0,pieces);
	        PICTUREPUZZLEPIECES piece9 = new PICTUREPUZZLEPIECES(9,9,0,pieces);
	        
	           //adding the puzzle pieces to the  second column
	        PICTUREPUZZLEPIECES piece10 =new PICTUREPUZZLEPIECES(10,0,1,pieces);
	        PICTUREPUZZLEPIECES piece11 = new PICTUREPUZZLEPIECES(11,1,1,pieces);
	        PICTUREPUZZLEPIECES piece12 = new PICTUREPUZZLEPIECES(12,2,1,pieces);
	        PICTUREPUZZLEPIECES piece13 = new PICTUREPUZZLEPIECES(13,3,1,pieces);
	        PICTUREPUZZLEPIECES piece14 = new PICTUREPUZZLEPIECES(14,4,1,pieces);
	        PICTUREPUZZLEPIECES piece15 = new PICTUREPUZZLEPIECES(15,5,1,pieces);
	        PICTUREPUZZLEPIECES piece16 = new PICTUREPUZZLEPIECES(16,6,1,pieces);
	        PICTUREPUZZLEPIECES piece17 = new PICTUREPUZZLEPIECES(17,7,1,pieces);
	        PICTUREPUZZLEPIECES piece18 = new PICTUREPUZZLEPIECES(18,8,1,pieces);
	        PICTUREPUZZLEPIECES piece19 = new PICTUREPUZZLEPIECES(19,9,1,pieces);
	        
	          //adding the puzzle pieces to the third column
	        PICTUREPUZZLEPIECES piece20 =new PICTUREPUZZLEPIECES(20,0,2,pieces);
	        PICTUREPUZZLEPIECES piece21 = new PICTUREPUZZLEPIECES(21,1,2,pieces);
	        PICTUREPUZZLEPIECES piece22 = new PICTUREPUZZLEPIECES(22,2,2,pieces);
	        PICTUREPUZZLEPIECES piece23 = new PICTUREPUZZLEPIECES(23,3,2,pieces);
	        PICTUREPUZZLEPIECES piece24 = new PICTUREPUZZLEPIECES(24,4,2,pieces);
	        PICTUREPUZZLEPIECES piece25 = new PICTUREPUZZLEPIECES(25,5,2,pieces);
	        PICTUREPUZZLEPIECES piece26 = new PICTUREPUZZLEPIECES(26,6,2,pieces);
	        PICTUREPUZZLEPIECES piece27 = new PICTUREPUZZLEPIECES(27,7,2,pieces);
	        PICTUREPUZZLEPIECES piece28 = new PICTUREPUZZLEPIECES(28,8,2,pieces);
	        PICTUREPUZZLEPIECES piece29 = new PICTUREPUZZLEPIECES(29,9,2,pieces);
	        
	         //adding the puzzle pieces to the forth column
	        PICTUREPUZZLEPIECES piece30 =new PICTUREPUZZLEPIECES(30,0,3,pieces);
	        PICTUREPUZZLEPIECES piece31 = new PICTUREPUZZLEPIECES(31,1,3,pieces);
	        PICTUREPUZZLEPIECES piece32 = new PICTUREPUZZLEPIECES(32,2,3,pieces);
	        PICTUREPUZZLEPIECES piece33 = new PICTUREPUZZLEPIECES(33,3,3,pieces);
	        PICTUREPUZZLEPIECES piece34 = new PICTUREPUZZLEPIECES(34,4,3,pieces);
	        PICTUREPUZZLEPIECES piece35 = new PICTUREPUZZLEPIECES(35,5,3,pieces);
	        PICTUREPUZZLEPIECES piece36 = new PICTUREPUZZLEPIECES(36,6,3,pieces);
	        PICTUREPUZZLEPIECES piece37 = new PICTUREPUZZLEPIECES(37,7,3,pieces);
	        PICTUREPUZZLEPIECES piece38 = new PICTUREPUZZLEPIECES(38,8,3,pieces);
	        PICTUREPUZZLEPIECES piece39 = new PICTUREPUZZLEPIECES(39,9,3,pieces);
	        
	         //adding the puzzle pieces to the fifth column
	        PICTUREPUZZLEPIECES piece40 =new PICTUREPUZZLEPIECES(40,0,4,pieces);
	        PICTUREPUZZLEPIECES piece41 = new PICTUREPUZZLEPIECES(41,1,4,pieces);
	        PICTUREPUZZLEPIECES piece42 = new PICTUREPUZZLEPIECES(42,2,4,pieces);
	        PICTUREPUZZLEPIECES piece43 = new PICTUREPUZZLEPIECES(43,3,4,pieces);
	        PICTUREPUZZLEPIECES piece44 = new PICTUREPUZZLEPIECES(44,4,4,pieces);
	        PICTUREPUZZLEPIECES piece45 = new PICTUREPUZZLEPIECES(45,5,4,pieces);
	        PICTUREPUZZLEPIECES piece46 = new PICTUREPUZZLEPIECES(46,6,4,pieces);
	        PICTUREPUZZLEPIECES piece47 = new PICTUREPUZZLEPIECES(47,7,4,pieces);
	        PICTUREPUZZLEPIECES piece48 = new PICTUREPUZZLEPIECES(48,8,4,pieces);
	        PICTUREPUZZLEPIECES piece49 = new PICTUREPUZZLEPIECES(49,9,4,pieces);
	        
	         //adding the puzzle pieces to the sixth column
	        PICTUREPUZZLEPIECES piece50 =new PICTUREPUZZLEPIECES(50,0,5,pieces);
	        PICTUREPUZZLEPIECES piece51 = new PICTUREPUZZLEPIECES(51,1,5,pieces);
	        PICTUREPUZZLEPIECES piece52 = new PICTUREPUZZLEPIECES(52,2,5,pieces);
	        PICTUREPUZZLEPIECES piece53 = new PICTUREPUZZLEPIECES(53,3,5,pieces);
	        PICTUREPUZZLEPIECES piece54 = new PICTUREPUZZLEPIECES(54,4,5,pieces);
	        PICTUREPUZZLEPIECES piece55 = new PICTUREPUZZLEPIECES(55,5,5,pieces);
	        PICTUREPUZZLEPIECES piece56 = new PICTUREPUZZLEPIECES(56,6,5,pieces);
	        PICTUREPUZZLEPIECES piece57 = new PICTUREPUZZLEPIECES(57,7,5,pieces);
	        PICTUREPUZZLEPIECES piece58 = new PICTUREPUZZLEPIECES(58,8,5,pieces);
	        PICTUREPUZZLEPIECES piece59 = new PICTUREPUZZLEPIECES(59,9,5,pieces);
	        
	         //adding the puzzle pieces to the seventh column
	        PICTUREPUZZLEPIECES piece60 =new PICTUREPUZZLEPIECES(60,0,6,pieces);
	        PICTUREPUZZLEPIECES piece61 = new PICTUREPUZZLEPIECES(61,1,6,pieces);
	        PICTUREPUZZLEPIECES piece62 = new PICTUREPUZZLEPIECES(62,2,6,pieces);
	        PICTUREPUZZLEPIECES piece63 = new PICTUREPUZZLEPIECES(63,3,6,pieces);
	        PICTUREPUZZLEPIECES piece64 = new PICTUREPUZZLEPIECES(64,4,6,pieces);
	        PICTUREPUZZLEPIECES piece65 = new PICTUREPUZZLEPIECES(65,5,6,pieces);
	        PICTUREPUZZLEPIECES piece66 = new PICTUREPUZZLEPIECES(66,6,6,pieces);
	        PICTUREPUZZLEPIECES piece67 = new PICTUREPUZZLEPIECES(67,7,6,pieces);
	        PICTUREPUZZLEPIECES piece68 = new PICTUREPUZZLEPIECES(68,8,6,pieces);
	        PICTUREPUZZLEPIECES piece69 = new PICTUREPUZZLEPIECES(69,9,6,pieces);
	        
	          //adding the puzzle pieces to the eighth column
	        PICTUREPUZZLEPIECES piece70 =new PICTUREPUZZLEPIECES(70,0,7,pieces);
	        PICTUREPUZZLEPIECES piece71 = new PICTUREPUZZLEPIECES(71,1,7,pieces);
	        PICTUREPUZZLEPIECES piece72 = new PICTUREPUZZLEPIECES(72,2,7,pieces);
	        PICTUREPUZZLEPIECES piece73 = new PICTUREPUZZLEPIECES(73,3,7,pieces);
	        PICTUREPUZZLEPIECES piece74 = new PICTUREPUZZLEPIECES(74,4,7,pieces);
	        PICTUREPUZZLEPIECES piece75 = new PICTUREPUZZLEPIECES(75,5,7,pieces);
	        PICTUREPUZZLEPIECES piece76 = new PICTUREPUZZLEPIECES(76,6,7,pieces);
	        PICTUREPUZZLEPIECES piece77 = new PICTUREPUZZLEPIECES(77,7,7,pieces);
	        PICTUREPUZZLEPIECES piece78 = new PICTUREPUZZLEPIECES(78,8,7,pieces);
	        PICTUREPUZZLEPIECES piece79 = new PICTUREPUZZLEPIECES(79,9,7,pieces);
	        
	          //adding the puzzle pieces to the nineth column
	        PICTUREPUZZLEPIECES piece80 =new PICTUREPUZZLEPIECES(80,0,8,pieces);
	        PICTUREPUZZLEPIECES piece81 = new PICTUREPUZZLEPIECES(81,1,8,pieces);
	        PICTUREPUZZLEPIECES piece82 = new PICTUREPUZZLEPIECES(82,2,8,pieces);
	        PICTUREPUZZLEPIECES piece83 = new PICTUREPUZZLEPIECES(83,3,8,pieces);
	        PICTUREPUZZLEPIECES piece84 = new PICTUREPUZZLEPIECES(84,4,8,pieces);
	        PICTUREPUZZLEPIECES piece85 = new PICTUREPUZZLEPIECES(85,5,8,pieces);
	        PICTUREPUZZLEPIECES piece86 = new PICTUREPUZZLEPIECES(86,6,8,pieces);
	        PICTUREPUZZLEPIECES piece87 = new PICTUREPUZZLEPIECES(87,7,8,pieces);
	        PICTUREPUZZLEPIECES piece88 = new PICTUREPUZZLEPIECES(88,8,8,pieces);
	        PICTUREPUZZLEPIECES piece89 = new PICTUREPUZZLEPIECES(89,9,8,pieces);
	        
	          //adding the puzzle pieces to the tenth column
	        PICTUREPUZZLEPIECES piece90 =new PICTUREPUZZLEPIECES(90,0,9,pieces);
	        PICTUREPUZZLEPIECES piece91 = new PICTUREPUZZLEPIECES(91,1,9,pieces);
	        PICTUREPUZZLEPIECES piece92 = new PICTUREPUZZLEPIECES(92,2,9,pieces);
	        PICTUREPUZZLEPIECES piece93 = new PICTUREPUZZLEPIECES(93,3,9,pieces);
	        PICTUREPUZZLEPIECES piece94 = new PICTUREPUZZLEPIECES(94,4,9,pieces);
	        PICTUREPUZZLEPIECES piece95 = new PICTUREPUZZLEPIECES(95,5,9,pieces);
	        PICTUREPUZZLEPIECES piece96 = new PICTUREPUZZLEPIECES(96,6,9,pieces);
	        PICTUREPUZZLEPIECES piece97 = new PICTUREPUZZLEPIECES(97,7,9,pieces);
	        PICTUREPUZZLEPIECES piece98 = new PICTUREPUZZLEPIECES(98,8,9,pieces);
	        PICTUREPUZZLEPIECES piece99 = new PICTUREPUZZLEPIECES(99,9,9,pieces);
	        
//////////////Adding piece to the board/////////////////////////////////////////////////////////////////
	        piece10.printed = true; 
	        piece11.printed = true;
	        
	        piece12.printed = true;
	        piece14.printed = true;
	        
	        piece15.printed = true;
	      
	        piece17.printed = true;
	        piece18.printed = true;
	        
	        
	        piece20.printed = true;
	        piece21.printed = true;
	        piece22.printed = true;
	     
	        piece24.printed = true;
	        piece25.printed = true;
	       
	        piece27.printed = true;
	        piece28.printed = true;
	        piece29.printed = true;
	      
	        piece31.printed = true;
	        piece32.printed = true;
	     
	        piece34.printed = true;
	       
	        piece36.printed = true;
	        
	     
	        piece38.printed = true;
	        piece39.printed = true;
	       
	        piece41.printed = true;
	       
	        piece43.printed = true;
	     
	        piece45.printed = true;
	        
	        piece46.printed = true;
	        piece47.printed = true;
	       
	        piece49.printed = true;
	        piece50.printed = true;
	        piece51.printed = true;
	        
	        piece53.printed = true;
	        piece54.printed = true;
	        
	      
	        piece56.printed = true;
	      
	        piece58.printed = true;
	   
	        piece60.printed = true;
	        piece61.printed = true;
	      
	        piece63.printed = true;
	       
	       
	        piece65.printed = true;
	       
	        piece67.printed = true;
	      
	        piece69.printed = true;
	        piece70.printed = true;
	     
	        piece72.printed = true;
	        
	        piece73.printed = true;
	        piece74.printed = true;
	       
	        piece76.printed = true;
	        piece77.printed = true;
	     
	        piece79.printed = true;
	        piece80.printed = true;
	        piece81.printed = true;
	        
	        piece82.printed = true;
	      
	        piece84.printed = true;
	        piece85.printed = true;
	      
	        piece87.printed = true;
	      
	        piece89.printed = true;
	      
	        piece93.printed= true;	        
	        piece99.printed = true;
	        
	        
		
		
		
		
		
		JFrame frame = new JFrame();        // creates new frame
		frame.setTitle("PICTURE PUZZLE");   // sets title 
		frame.setBounds(10,10,1000,1000);   // sets the bounds
		frame.setUndecorated(true);           
		frame.setBackground(Color.gray);    //sets backgorund color to gray
		
		JButton hint = new JButton();       // creates jbutton called hint
		hint.setText("HINT");               
        hint.setPreferredSize(new Dimension(100,50)); // preferred height and width
        hint.addActionListener(new ActionListener()   // adds action listener to recieve input
        		{

					@Override
					public void actionPerformed(ActionEvent e) {  
						if(e.getSource()==hint)       // checks if hint button is pressed
						{
						    PUZZLEFUNCTION.hint();   // if pressed call the hint method in puzzlefunction
						}
						
					}
        	
        		});
        
        frame.add(hint,BorderLayout.EAST);       // adds the button on the far left side of frame
		
		
		JPanel panel = new JPanel() {              // cretaes new JPanel
			@Override
			  public void paint(Graphics g) {
            
			// Draws vertical lines to create a grid on the panel
            	g.setColor(Color.blue); // color of grid blue
            	g.drawLine(50, 0, 50, 500);   
            	g.drawLine(100, 0, 100, 500);
            	g.drawLine(150, 0, 150, 500);
            	g.drawLine(200, 0, 200, 500);
            	g.drawLine(250, 0, 250, 500);
            	g.drawLine(300, 0, 300, 500);
            	g.drawLine(350, 0, 350, 500);
            	g.drawLine(400, 0, 400, 500);
            	g.drawLine(450, 0, 450, 500);
            	g.drawLine(500, 0, 500, 500);
            	
            	// Draw horizontal lines to create a grid on the panel
            	g.drawLine(0, 50, 500, 50); // first two numbers x and y starting last two x and y finishing
            	g.drawLine(0, 100, 500, 100);
            	g.drawLine(0, 150, 500, 150);
            	g.drawLine(0, 200, 500, 200);
            	g.drawLine(0, 250, 500, 250);
            	g.drawLine(0, 300, 500, 300);
            	g.drawLine(0, 350, 500, 350);
            	g.drawLine(0, 400, 500, 400);
            	g.drawLine(0, 450, 500, 450);
            	g.drawLine(0, 500, 500, 500);
		
			
            	if(NextPieceReady == true)    // checks if new puzzle piece is ready to be displayed
            	{
            		
            		int x = 0;              // will store the random index of the piece
            		
            		try
            		{
            			do
	            		{
	            			Random rand = new Random();          //creates a random number
		            		x = rand.nextInt(pieces.size()-1);    // stores a random number between 0 to 99
		            		temp = pieces.get(Integer.valueOf(x)); // will store the piece at the generated index
	            		}
	            		while(temp.printed == true);              // checks if already printed 
            		}                                             // if printed generate random number again
            		catch(Exception exception)
            		{
            			
            		}
            		
            		for(PICTUREPUZZLEPIECES p: pieces)        // loop over all the pieces in the linked list
            		{
            			if(p.index == x)                     // checks if the current peice index with random number
            			{
            				 
            				random = p;                     // asigns the piece to random variable
            				random.xtemp = 12;              // sets the inital temporary x positon of the piece
            				random.ytemp = 6;               // sets the inital temporary y position of the piece
            				random.actualxpositon = 600;    // sets the real x positon of piece
            				random.actutalyposition = 300;  // sets the real y position of piece
            				NextPieceReady = false;         // sets this to false since the new piece is printed
            				
            			}
            		}
            	}
            	g.drawImage(img[random.index], random.actualxpositon, random.actutalyposition, this); //Prints the puzzle piece outside
            	
               
            	for(PICTUREPUZZLEPIECES p: pieces){        //iterates through each puzzle piece in the piece list.)
                    if(p.printed == true)                  //Check if the current piece has been placed on the board
                    {
                    	
                    	
                    	g.drawImage(img[p.index], p.xposition*50, p.yposition*50, this);
                    	
                    	
    	
                    			
                    }
                }
            }
            
        };
        frame.add(panel);                                // adds panel to frame
        
        frame.addMouseMotionListener(new MouseMotionListener() { //adds mouse listner
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				if(selectedPiece != null)
				{
					selectedPiece.actualxpositon = e.getX()-32;   // update the actual x positon of selected piece to match mouse pointer
					selectedPiece.actutalyposition = e.getY()-32; // updates the actual y position of selected piece to match the mouse pointer
					frame.repaint();              //repaints frame to show the updated positon of selected piece
				}
			}
		});
        
        
        frame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				try
				{
					
					System.out.println("Xrow: " + selectedPiece.xposition);  // prints the x coordinate of the piece in the puzzle board
					System.out.println("Ycol: " + selectedPiece.yposition); // prints the y coordinate of the piece in the puzzle board
					
				
					
					
					
					if(e.getX()/50 == selectedPiece.xposition && e.getY()/50 == selectedPiece.yposition) //checks if mouse positon of mouse click mathces the positon of selted piece
					{
						selectedPiece.printed = true; //If yes, set the printed flag to true and prepare for next piece
						NextPieceReady = true;        // sets the the signal to print the next piece
						counter++;
						if(counter == 100)
						{
							PUZZLEFUNCTION.endgame();
							frame.dispose();      // closes the frame
						}
									
						
					   //resets the  actaul positon of the selected piece
						selectedPiece.actualxpositon = 0;
						selectedPiece.actutalyposition = 0;
						
						//resets the temporary positon of selectedpiece
						selectedPiece.xtemp = 0;
						selectedPiece.ytemp = 0;
					}
					else                                    // if the mouse click and positon of piece dont match
					{
						//move selected piece back to it original position
						selectedPiece.actualxpositon = 600;  
						selectedPiece.actutalyposition = 300; 
					}
				}
				catch(Exception ex)
				{
					
				}
				frame.repaint();
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				selectedPiece = getPiece(e.getX(), e.getY()); // set the selected piece to the piece located at the posion of mouse click
				
				try
				{
					// Print the x and y position of the selected puzzle piece to the console
					System.out.println(selectedPiece.xposition);
					System.out.println(selectedPiece.yposition);
				}
				catch(Exception eee)
				{
					
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				
			}
		});
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // closes on pressing exit
        frame.setBackground(Color.GRAY);                        // sets color of frame gray
        frame.setVisible(true);                                 // makes frame visible
        
    }
   
   public static PICTUREPUZZLEPIECES getPiece(int x, int y)
   {
	                                             // Calculate the grid square that the click occurred in
	   int xx = x/50;
	   int yy = y/50;
	   
	                                            // Search for the puzzle piece that matches the grid square
	   for(PICTUREPUZZLEPIECES p: pieces)
	   {
		   if(p.xtemp == 12 && xx == 12 && p.ytemp == 6 && yy == 6)
		   {
			   return p; 	                   // Return the puzzle piece if it matches the grid square
		   }
	   }
	   return null;                           // Return null if no puzzle piece matches the grid square
   }
}

   

   

			
			
			
			
			

		
		
		
	


