import org.junit.Test;
import static org.junit.Assert.assertEquals; 
//import org.junit.Assert.assertThrows; 
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TestJUnit {
  @Test
  public void testAverage(){
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    Context context = new Context(new CalcAvgDropped());	
    mylist.add(0, 10);
    mylist.add(1, 30);
    mylist.add(2, 5);
    assertEquals(context.executeStrategy(mylist), 30);
  }

  @Test
  public void testAverage01(){
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    Context context = new Context(new CalcAvgDropped());	
    mylist.add(0, 10);
    mylist.add(1, 30);
    mylist.add(2, 5);
    assertEquals(context.executeStrategy(mylist), 30);
  }

  @Test
  public void testEmpty() {
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    Context context = new Context(new CalcAvg());
    assertEquals(context.executeStrategy(mylist), -1);
  }

  @Test
  public void testEmpty01(){
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    Context context = new Context(new CalcAvgDropped());
    mylist.add(0, 10);
    assertEquals(context.executeStrategy(mylist), -1);    
  }
  

}


 