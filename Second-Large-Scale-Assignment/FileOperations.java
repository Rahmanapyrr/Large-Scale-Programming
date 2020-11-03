package howard.edu.oop.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class FileOperations {
  public FileOperations(){};

  public int [][] getTestArrays(String filepath) {
    int[][] grid = new int [10][10];

    try {
      Scanner scanner = new Scanner(new File(filepath));
      int w = 0;

      while (scanner.hasNextLine() || w < 10){
        String line = scanner.nextLine();
        String[] arr = line.split(", ", 8);

        for (int i = 0; i < arr.length; i++){
          grid[w][i] = Integer.parseInt(arr[i]);
        }
        w++;
        
        // for (int x = 0; x < arr.length; x++){
        //   for (int y = 0; y < arr.length; y++){
        //     System.out.print(grid[x][y] + " ");
        //   }
        //   System.out.println();
        // }
      }
        scanner.close(); 
    } catch (FileNotFoundException e){
        e.printStackTrace();
      }
    System.out.print(Arrays.toString(grid[6]));
     return grid;
  }
}