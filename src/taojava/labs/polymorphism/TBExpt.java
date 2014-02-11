package taojava.labs.polymorphism;

import java.io.PrintWriter;

/**
 * A series of experiments with the layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.1 of February 2014
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

    TBUtils.print(pen, new TextLine("Hello"));
    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
