//Tuesday 25th June 2024 Session 9
package com.cbfacademy.search;
import java.util.Arrays; 


public class BinarySearch implements Search {

public int search(int[] arr, int target){
  int low = 0;
  int high = arr.length - 1;

  while (low <= high){
    int mid = (low + high) / 2;
 
    if (target == arr[mid]){
      return mid;
    }else if (target > arr[mid]){
      low = mid + 1;
    }else {
      
      high = mid -1;

    }
    
  }
  return -1;

}
}
