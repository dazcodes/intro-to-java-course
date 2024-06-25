package com.cbfacademy.arrays;
import java.lang.reflect.Array;

public class Arrayshw {
  public static void main(String... args){
   int[] numbers = {1, 2, 3, 4, 5,6,7,8};
    float [] numbers2 = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.1f, 11.1f, 12.1f};
    double[] numbers3 = {4.55, 6.77, 8.99, 1.45, 10.45, 3.59, 12.21 };
    boolean [] WillItRain = {true, false, true, true, false,false,true}; 
  
    /*int [][] matrix1 = { {1, 2, 3, 4, 5, 6, 7, 8}};
    float [][] matrix2 = {{1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.1f, 11.1f, 12.1f}};
    double [][] matrix3 = {{4.55, 6.77, 8.99, 1.45, 10.45, 3.59, 12.21}};
    boolean [][] matrix4 = {{true, false, true, true, false,false,true}}; */

    

    System.out.println(numbers[4]);
    System.out.println(numbers2[4]);
    System.out.println(numbers3[4]);
    System.out.println(WillItRain[4]);
    
    /*System.out.println(matrix1[6]);
    System.out.println(matrix2[6]);
    System.out.println(matrix3[6]);
    System.out.println(matrix4[6]);*/

    Object [] matrix = {numbers, numbers2, numbers3, WillItRain};

    for (Object o: matric) {
      System.out.println(Arrayshw.get(o,index:4));
    }




    
  }  
  
}



