package taojava.labs.polymorphism;

import java.io.PrintWriter;

/**
 * Utilities for TextBlocks.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.1 of February 2014
 */
public class TBUtils
{
  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Print a TextBlock to the specified destination.
   */
  public static void print(PrintWriter pen, TextBlock block)
  {
    for (int i = 0; i < block.height(); i++)
      {
        // Even though we only call block.row with a valid i,
        // we need to put the call in a try/catch block.
        try
          {
            pen.println(block.row(i));
          } // try
        catch (Exception e)
          {
            pen.println();
          } // catch (Exception)
      } // for
  } // print(PrintWriter, TextBlock)

} // class TBUtils
