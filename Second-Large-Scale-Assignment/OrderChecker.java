class OrderChecker { 
  OrderChecker(){};

  public boolean isAscending(int [] arr) {
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

  public boolean isDescending(int [] arr) {
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