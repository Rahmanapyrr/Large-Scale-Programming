// Rahmana Muhammad
// @02817384
// 04/25/2019
// Assignment 6, Large Scale Programming, SP2019
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello");
   
    Result result = JUnitCore.runClasses(TestJUnit.class);
    
    if(result.wasSuccessful()){
      System.out.println("All tests were successful. :)");
    }
    else{
      System.out.println("There seeems to be a problem of some sort. At least one of the tests failed");
    }
  }
}
 // ArrayList<Integer> mylist = new ArrayList<Integer>();
  // // mylist.add(0, 10);
  // // mylist.add(1, 30);
  // // mylist.add(2, 5);

  // Context context = new Context(new CalcAvg());		
  // System.out.println(context.executeStrategy(mylist));

  // context = new Context(new OperationSubstract());		
   // System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
