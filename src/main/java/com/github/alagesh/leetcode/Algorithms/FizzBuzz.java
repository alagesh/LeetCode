package com.github.alagesh.leetcode.Algorithms;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number 
 * and for the multiples of five output “Buzz”.
 *  For numbers which are multiples of both three and five output “FizzBuzz”.
 * @author Azhakesan Thangamuthu
 */

public class FizzBuzz {
	
	private String processNumber(int value){
        String retValue="";
        boolean flag = false;
        /*
        * Logic : 
        * For multiples of 3 -> append Fizz 
        * For multiples of 5 -> append Buzz
        * So for both multiples of 3 & 5 , code appends FizzBuzz
        * If not multiple of 3 or 5 , Return input number
        */
        if(value%3 == 0){
            retValue = retValue+"Fizz";
            flag =true;            
        }
        
        if(value%5 == 0){
            retValue = retValue+"Buzz";
            flag =true;
        }
        
        if(!flag){
            retValue = ""+value;
        }
        
        return retValue;
    }
    
    public List<String> fizzBuzz(int n) {
        
         List<String> output = new ArrayList<String>();
        //Check for Negative numbers
        if( n > 0) {
            // iterate from 1 to n and call function 
            // to calculate string value for each number
            for(int i=1 ;i <=n; i++){
                
               output.add(processNumber(i));
            }
            
        }
        return output;
        
    }
}
