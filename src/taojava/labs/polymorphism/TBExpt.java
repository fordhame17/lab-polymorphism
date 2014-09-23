package taojava.labs.polymorphism;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.2 of September 2014
 */
public class TBExpt
{
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
    throws Exception
  {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block = new TextLine("Hello");
    
    // Print out the block
    TBUtils.print(pen, block);
    
    TextBlock block2 = new TextLine("This is a test.");
    TBUtils.print(pen,block2);
    
    BoxedBlock block3 = new BoxedBlock (block2) ;
    BoxedBlock block4 = new BoxedBlock (block3) ;
    
    
    
    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
