package taojava.labs.polymorphism;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

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
        pen.println(root + "^2 = " + (root * root));
      } // for i

      double root2 = MathUtils.squareRoot(new Integer(9)) ;
      pen.println("The square root of Integer 9" + " seems to be " + root2);

      double root3 = MathUtils.squareRoot(new Float(9.0)) ;
      pen.println("The square root of Float 9" + " seems to be " + root3);
      
      double root4 = MathUtils.squareRoot(new Double(9.0)) ;
      pen.println("The square root of Double 9" + " seems to be " + root4);
      
      //double root5 = MathUtils.squareRoot(new BigInteger(9)) ;
      //pen.println("The square root of BigInteger 9" + " seems to be " + root5);
      
      double root6 = MathUtils.squareRoot(new BigDecimal(9)) ;
      pen.println("The square root of BigDecimal 9" + " seems to be " + root6);
      
      double root7 = MathUtils.squareRoot((double)9.0) ;
      pen.println("The square root of double 9" + " seems to be " + root7);
      
    // We're done. Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
