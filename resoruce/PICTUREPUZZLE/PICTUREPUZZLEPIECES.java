package PICTUREPUZZLE;

import java.util.LinkedList;

public class PICTUREPUZZLEPIECES 
{
   int index ;          // stores imdex of the puzzle pieces
   int xposition;       //  store position of x
   int yposition;       //  store positon of y 
   
   int xtemp;           //stores the temporary value of x 
   int ytemp;           // stores temporary value of y 
   
   int actualxpositon;  // stores real position of x 
   int actutalyposition;// stores real position of y
   
   LinkedList<PICTUREPUZZLEPIECES>pieces; // creates Linked list called pieces to store the sub images
   boolean printed = false;  // boolean to check if a sub image (puzzle piece) is printed
   
   
   public PICTUREPUZZLEPIECES(int index,int xpos,int ypos,LinkedList<PICTUREPUZZLEPIECES>pieces)
   {
	  //instance variables//
 	  this.index = index;
 	  this.xposition = xpos;
 	  this.yposition = ypos;
 	  this.pieces = pieces;
 	  pieces.add(this);
 	  
   }
   
}
