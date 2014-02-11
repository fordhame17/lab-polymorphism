package taojava.labs.polymorphism;

/**
 * The vertical composition of two text blocks.
 *
 * @author Samuel A. Rebelsky
 * @version 1.1 of February 2014
 */
public class VCompose
  implements TextBlock
{
  // +--------------+------------------------------------------------------
  // | Class Fields |
  // +--------------+

  /**
   * A really big sequence of spaces.  This sequence may grow as
   * the program operates.
   */
  String lotsOfSpaces = "  ";


  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The top portion of the composition.
   */
  TextBlock top;

  /**
   * The bottom portion of the composition.
   */
  TextBlock bottom;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block by composing top and bottom vertically.
   */
  public VCompose(TextBlock top, TextBlock bottom)
  {
    this.top = top;
    this.bottom = bottom;
  } // VCompose(String)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   *
   * @pre
   *   0 <= i < this.height()
   * @exception Exception
   *   if the precondition is not met
   */
  public String row(int i)
    throws Exception
  {
    // Gather some basic information
    int th = this.top.height();
    int bh = this.bottom.height();
    int tw = this.top.width();
    int bw = this.bottom.width();
    int h = th + bh;

    // Determine padding
    String padtop = "";
    String padbot = "";
    if (tw > bw) 
      {
        padbot = spaces(tw-bw);
      } // if the top is wider
    else // the bottom is wider
      {
        padtop = spaces(bw-tw);
      } // the bottom is wider

    if ((i < 0) || (i >= h)) 
      {
        throw new Exception("Invalid row " + i);
      } // if the row is invalid
    else if (i < th) 
      {
        return this.top.row(i) + padtop;
      } // if the row is in the top half
    else 
      {
        return this.bottom.row(i-th) + padbot;
      } // if the row is in the bottom half
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    // The height is the sum of the heights of the top and bottom
    // blocks.
    return this.top.height() + this.bottom.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    // The width is the greater of the widths of the top and bottom
    // blocks.
    return Math.max(this.top.width(), this.bottom.width());
  } // width()
 
  // +---------------+-----------------------------------------------------
  // | Class Methods |
  // +---------------+

  /**
   * Build a sequence of spaces of a specified length.
   */
  String spaces(int len)
  {
    // Make sure the collection of dashes is big enough
    while (lotsOfSpaces.length() < len) 
      {
        lotsOfSpaces = lotsOfSpaces.concat(lotsOfSpaces);
      } // while
    // Extract an appropriate length substring
    return lotsOfSpaces.substring(0,len);
  } // spaces(int)

} // class VCompose
