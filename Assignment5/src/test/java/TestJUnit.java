import org.junit.Test;
import static org.junit.Assert.assertEquals; 
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TestJUnit {

   @Test
  public void testContain(){
    PriceRange myrange = new PriceRange(0, 10);
    assertTrue(myrange.contains(1));
  }

  @Test
  public void testDoesNotContain(){
    PriceRange lacking_num = new PriceRange(10, 18);
    assertFalse(lacking_num.contains(2));
  }

  @Test
  public void testOverlaps(){
    PriceRange myrange = new PriceRange(2, 25);
    PriceRange your_range = new PriceRange(10, 20);
    assertTrue(myrange.overlaps(your_range));
  }

  @Test
  public void testOverlapsFalse(){
    PriceRange myrange = new PriceRange(2, 25);
    PriceRange your_range = new PriceRange(30, 50);
    assertFalse(myrange.overlaps(your_range));
  }

  /**
  explanation:  This methods tests whether the .sizze() method returns the correct size.
  */

  @Test
  public void testCorrectSize(){
    PriceRange little_Range = new PriceRange(0, 10);
    assertEquals(little_Range.size(), 11);

    PriceRange bigRange = new PriceRange(50, 101);
    assertEquals(bigRange.size(), 52);
  }

  /**
  explanation:  This methods tests whether two range objects are equal to each other
  @param None
  @return 
  */
  @Test
  public void testRangeEquals(){
    PriceRange range_one = new PriceRange(10, 20);
    PriceRange range_two = new PriceRange(10, 20);
    PriceRange range_three = new PriceRange(20, 30);

    assertFalse(range_one.isEquals(range_three));
    assertTrue(range_two.isEquals(range_two));
  }
}