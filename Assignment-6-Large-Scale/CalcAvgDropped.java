import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class CalcAvgDropped implements AverageStrategy{
  @Override
  public int calcAvg(ArrayList<Integer> grades) throws EmptyListException{
    if(!(grades.isEmpty())){
      grades.remove(Collections.min(grades));
    }
    
    if(!grades.isEmpty()){
      grades.remove(Collections.min(grades));
     }

    Integer sum = 0;
    if(!grades.isEmpty()) {
        for (Integer grade : grades) {
        sum += grade;
      }
    }
  else {
    throw new EmptyListException();
  }
   return sum / grades.size();
  }
}