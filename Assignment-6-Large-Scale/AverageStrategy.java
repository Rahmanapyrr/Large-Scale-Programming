import java.util.List;
import java.util.ArrayList;
import java.io.*;

public interface AverageStrategy {
  public int calcAvg(ArrayList<Integer> grades) throws EmptyListException;
}
