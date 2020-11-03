//  Rahmana Muhammad
//  @02817384
//  2/14/2018
//  Assignment 2 Large Scale Programming, SP2019
import java.util.Arrays;
import howard.edu.oop.assignment2.FileOperations;

class Main {
  public static void main(String[] args) {
    FileOperations operator = new FileOperations();
    OrderChecker checker = new OrderChecker();

    int my_grid [][] = operator.getTestArrays("arrays.txt");

    for (int x = 0; x < 10; x++){
      int i = 0;
      while (i < 10){
        if (my_grid[x][i] == 0) {   // calculating the index where the trailing zeros begin
          break;
        }
        i++;
      }

      int [] new_grid = new int[i];  //creating new array to hold everything but trailing zeros
      for (int l = 0; l < i; l++){
        new_grid[l] = my_grid[x][l];
      }

//printing the array
      System.out.print("The array: ");
      System.out.print(Arrays.toString(new_grid));

  // checking for ascending order
    if (checker.isAscending(new_grid)){
      System.out.println(" is in ascending order");
      }
    else {
      System.out.println(" is not in ascending order");
      }

// checking for descending order
      System.out.print("The array: ");
      System.out.print(Arrays.toString(new_grid));
    if (checker.isDescending(new_grid)){
        System.out.println(" is in descending order");
      }
    else {
      System.out.println(" is not in descending order");
      }
    }
  }
}

