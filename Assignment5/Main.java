// Rahmana Muhammad
// @02817384
// 04/06/2019
// Assignment 5, Large Scale Programming, SP2019
import java.io.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class Main {
  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(TestJUnit.class);
    
    if(result.wasSuccessful()){
      System.out.println("All tests were successful. :)");
    }
    else{
      System.out.println("There seeems to be a problem of some sort. At least one of the tests failed");
    }
  }

}
