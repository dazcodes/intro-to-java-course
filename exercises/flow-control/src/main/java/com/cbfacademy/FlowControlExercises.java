//Thursday 20th June 2024 Session 9
//result holds the values 
//the values for i is held in numbers
//list interface uses .size 
//core java arrays have a .length method such as strings 
package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
       
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
         List<String> result = new ArrayList<>();
         for (int i = 0; i < numbers.size(); i++){
          
            /* if (numbers.get(i) % 3 == 0 && numbers.ger(i) % 5){
             * results.add("FizzBuzz");
            } else if (numbers.get(i) % 5 == 0){
                result.add("Buzz"); 
         }  if (numbers.get(i) % 3 ==0) {
                result.add("Fizz"); */

        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
         if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0){
                result.add("FizzBuzz");
         }else if (numbers.get(i) % 3 == 0) {
                result.add("Fizz");
            }
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
          else if (numbers.get(i) % 5 == 0){
                result.add("Buzz");
            }  
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
            
         //  - it adds the element to the list in any other case
            else{
                result.add(numbers.get(i).toString());
         }
        
        //  - it returns the constructed list
       
    }
        return result;
}


    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        
            
            switch (month) {

                case 1: 
                System.out.print("January");
                break;

                case 2: 
                System.out.print("February");
                break;

                case 3: 
                System.out.print("March");
                break;

                case 4:
                System.out.print("April");
                break;

                case 5:
                System.out.print("May");
                break;

                case 6: 
                System.out.print("June");
                break;

                case 7:
                System.out.print("July");
                break;

                case 8: 
                System.out.print("August");
                break;

                case 9:
                System.out.print("September");
                break;

                case 10:
                System.out.print("October");
                break;

                case 11:
                System.out.print("November");
                break;

                case 12:
                System.out.print("December");
                default:
                System.out.println("Invalid month number");



            
        }
        
        
        
        // throw new RuntimeException("Not implemented");
    }


    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
