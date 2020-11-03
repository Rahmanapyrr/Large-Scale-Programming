import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;

public class Context {
   private AverageStrategy strategy;
   
   public Context(AverageStrategy strategy){
      this.strategy = strategy;
   }

  int average_val;
  
  public int executeStrategy(ArrayList<Integer> grades){
     try{
      average_val = strategy.calcAvg(grades);
    }
    catch (EmptyListException e){
        return -1;
        //e.ErrorMessage();
      }
      return average_val;
    }
}