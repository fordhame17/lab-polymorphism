package taojava.labs.polymorphism;

import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * A few simple experiments with our utilities.
 */
public class MathExpt
{
  public static void main(String[] args)
      throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    for (int i = 2; i < 10; i++)
      {
        double root = MathUtils.squareRoot(i);
        pen.println("The square root of " + i + " seems to be " + root);
        pen.println(root + "^2 = " + (root*root));
      } // for
 
    // We're done.  Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
