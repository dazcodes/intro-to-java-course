package com.cbfacademy.arrays;
import java.lang.reflect.Array;

public class Arrayshw {
  public static void main(String... args){
  int[] intArr = {12,24,14,23,64,14,63,54};
    float[] floatArr = {1f,2f,3f,4f,5f,6f,7f,8f,9f,10f,11f,12f};
    double[] doubleArr = new double[5];
    doubleArr[0] = 1d;
    doubleArr[1] = 2d;
    doubleArr[2] = 3d;
    doubleArr[3] = 4d;
    doubleArr[4] = 5d;
    boolean[] booleanArr = {true,false,false,true,false,true};

  
    /*int [][] matrix1 = { {1, 2, 3, 4, 5, 6, 7, 8}};
    float [][] matrix2 = {{1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.1f, 11.1f, 12.1f}};
    double [][] matrix3 = {{4.55, 6.77, 8.99, 1.45, 10.45, 3.59, 12.21}};
    boolean [][] matrix4 = {{true, false, true, true, false,false,true}}; */

    

    System.out.println(intArr[4]);
    System.out.println(floatArr[4]);
    System.out.println(doubleArr[4]);
    System.out.println(booleanArr[4]);

    /*System.out.println(matrix1[6]);
    System.out.println(matrix2[6]);
    System.out.println(matrix3[6]);
    System.out.println(matrix4[6]);*/

   //Object[] matrix = new Object[]{intArr,floatArr,doubleArr,booleanArr};
    Object[] matrix = {intArr,floatArr,doubleArr,booleanArr};
    // Object[] matrix = new Object[4];
    // matrix[0] = intArr;
    // matrix[1] = floatArr;
    // matrix[2] = doubleArr;
    // matrix[3] = booleanArr;

   for (Object o: matrix) {
    System.out.println(Array.get(o,4));





    
  }  
}
}
  




