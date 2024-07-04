package com.cbfacademy.sort;
import java.util.ArrayList;
import com.cbfacademy.sort.ArraySorter;

public class QuickSort implements ArraySorter{
 

  public void sort(int[] arr, int startIndex, int endIndex){
    if( startIndex < endIndex){
      int  pivotIndex = partition(arr, startIndex, endIndex);

       sort(arr, startIndex, pivotIndex - 1);
        sort(arr, pivotIndex + 1, endIndex);
    }



  }
// int arg[]= [2,5,8,1,3,7,9,10];
//             0 1 2 3 4 5 6 7
              //the boundary index is telling you not to go past the end
  //Look in this array and tell me what this index is at 
  public int partition(int[] arr, int startIndex, int endIndex){
    int  pivot = arr[endIndex];
    int boundaryIndex = startIndex - 1;
     for (int i = startIndex; i < endIndex; i++){
      if (arr[i] <= pivot){
      boundaryIndex = boundaryIndex + 1;
      swap(arr, boundaryIndex, i);


     }

  }
    swap(arr, boundaryIndex + 1, endIndex);
    return boundaryIndex + 1;
   // for currentIndex = startIndex to endIndex - 1
   
  } public void swap(int[] arr, int leftIndex, int rightIndex){
       int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
  
  }
  

