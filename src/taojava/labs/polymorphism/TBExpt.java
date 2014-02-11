package taojava.labs.polymorphism;

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;

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
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
