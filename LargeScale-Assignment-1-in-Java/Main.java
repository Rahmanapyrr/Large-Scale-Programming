
//  Rahmana Muhammad
//  @02817384
//  1/31/2018
//  Assignment 1 Large Scale Programming, SP2019

import java.util.Arrays;

class Main {
  public static void main(String[] args){
    OrderChecker checker = new OrderChecker();

  int[] myArray = {1, 2, 3 ,4, 5, 6, 7, 8, 9, 10};
  int[] Array_two = {1, 5, 7};
  int[] Array_three = {0, 10, 1};
  int[] Array_four = {15, 7, 3, 2, 1};
  int[] Array_five = {10};

  System.out.print("The array: ");
  System.out.print(Arrays.toString(myArray));

  if(checker.isAscending(myArray)){
    System.out.println(" is in ascending order");
  }
  else{
    System.out.println(" is not in ascending order");
  }

  System.out.print("The array: ");
  System.out.print(Arrays.toString(myArray));
  if(checker.isDescending(myArray)){
    System.out.println(" is in descending order");
  }
  else{
    System.out.println(" is not in descending order");
  }
//----------------------
  System.out.print("The array: ");
  System.out.print(Arrays.toString(Array_two));

  if(checker.isAscending(Array_two)){
    System.out.println(" is in ascending order");
  }
  else{
    System.out.println(" is not in ascending order");
  }

  System.out.print("The array: ");
  System.out.print(Arrays.toString(Array_two));
  if(checker.isDescending(Array_two)){
    System.out.println(" is in descending order");
  }
  else{
    System.out.println(" is not in descending order");
  }

//-----------------------------------------------
  System.out.print("The array: ");
  System.out.print(Arrays.toString(Array_three));

  if(checker.isAscending(Array_three)){
    System.out.println(" is in ascending order");
  }
  else{
    System.out.println(" is not in ascending order");
  }

  System.out.print("The array: ");
  System.out.print(Arrays.toString(Array_three));
  if(checker.isDescending(Array_three)){
    System.out.println(" is in descending order");
  }
  else{
    System.out.println(" is not in descending order");
  }

//----------------------------------------------
  System.out.print("The array: ");
  System.out.print(Arrays.toString(Array_four));

  if(checker.isAscending(Array_four)){
    System.out.println(" is in ascending order");
  }
  else{
    System.out.println(" is not in ascending order");
  }

  System.out.print("The array: ");
  System.out.print(Arrays.toString(Array_four));
  if(checker.isDescending(Array_four)){
    System.out.println(" is in descending order");
  }
  else{
    System.out.println(" is not in descending order");
  }   

  }
}

class OrderChecker { 
  OrderChecker(){};

  public static boolean isAscending(int [] arr) {
    if ((arr.length == 0) || (arr.length == 1)){
      System.out.println(" is too short for ascending or descending to apply.");
      return false;
    }

    for (int i = 0; i < (arr.length-1); i++){ 
      if (!(arr[i] < arr[i+1])){
        return false;
      }
    }
    return true;
  }

  public static boolean isDescending(int [] arr) {
      if ((arr.length == 0) || (arr.length == 1)){
        System.out.println(" is too short for ascending or descending to apply.");
        return false;
      }

     for (int i = 0; i < (arr.length-1); i++){ 
      if((arr[i] < arr[i+1])){
        return false;
      }
    }
    return true;
  } 
}