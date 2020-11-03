/*
  A Range objects represents an integer range, such as
  1-10 or 50701-50799. The lower and upper bounds of
  a Range are given at the time the object is created.
 */
public class PriceRange implements Range {
  private int upper;
  private int lower;

  /**
  This is a constructor that initializes the PriceRange object
  @param lower, upper
  @return PriceRange object
  */
  PriceRange(int lower, int upper){
    this.upper = upper;
    this.lower = lower;
  }

  /**
  Tests whether the argument is member of the range
  @param integer
  @return true if the arg is in range, false otherwise
  */
	public boolean contains(int value) {
      if ((value >= lower) && (value <= upper)) {
        return true;
      }
      return false;
  }
  
  /**
  This method tests if a range object contains a value in another given range (overlaps).
  @param An object that implements the Range interface
  @return true if the range overlaps with the arg, false otherwise
  */
  public boolean overlaps(Range other) {
    for(int i = lower; i != upper; i++) {
      if (other.contains(i)){
        return true;
        }
    }
    return false;
  }

  /**
  This method calulates the size of the range
  @param None
  @return the number of members in the range
  */
  public int size() {
    return ((this.upper - this.lower) + 1);
   }
     /**
  This mehtod tests whether two range objects are equal to each other.
  @param An object that implements the Range interface
  @return true if the two ranges are equal, false otherwise
  */
  public boolean isEquals(Range other) {
    if(other.contains((this.upper)+1)){
      return false;
    }
    if(other.contains((this.lower)-1)){
      return false;
    }
    return true;
  }

}