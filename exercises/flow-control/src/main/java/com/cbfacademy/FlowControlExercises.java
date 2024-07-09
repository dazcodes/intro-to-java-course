//Thursday 20th June 2024 Session 9
//result holds the values 
//the values for i is held in numbers
//list interface uses .size 
//core java arrays have a .length method such as strings 
package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
        
        
            switch (number) {

                case 1: 
                return "January";
            

                case 2: 
                return ("February");
                

                case 3: 
                return "March";
                

                case 4: 
                return "April";
                

                case 5:
                return "May";
                

                case 6: 
                return "June";
                

                case 7:
                return "July";
                

                case 8: 
                return "August";
                

                case 9:
                return "September";
                

                case 10:
                return "October";
                

                case 11:
                return "November";
                

                case 12:
                return "December";
            }
        
         return "Invalid month number";
            
        }
        
        
        
        // throw new RuntimeException("Not implemented");
     


    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        Map<String, Integer> sum = new HashMap <>();
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
