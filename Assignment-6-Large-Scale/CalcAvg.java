import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;

public class CalcAvg implements AverageStrategy{
  @Override
  public int calcAvg(ArrayList<Integer> grades) throws EmptyListException {
  Integer sum = 0;
  if(!grades.isEmpty()) {
    for (Integer grade : grades) {
        sum += grade;
    }
    return sum / grades.size();
  }
  else {
    throw new EmptyListException();
    }
  }
}