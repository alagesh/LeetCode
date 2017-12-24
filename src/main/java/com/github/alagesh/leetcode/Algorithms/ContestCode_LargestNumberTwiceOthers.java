package com.github.alagesh.leetcode.Algorithms;

  /*
	* In a given integer array nums, there is always exactly one largest element.
	
	*  Find whether the largest element in the array is at least twice as much as every other number in the array.
	
	* If it is, return the index of the largest element, otherwise return -1.
	
	* Example 1:
	* Input: nums = [3, 6, 1, 0]
	* Output: 1
	* Explanation: 6 is the largest integer, and for every other number in the array x,
	* 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
	
	* Example 2:
	* Input: nums = [1, 2, 3, 4]
	* Output: -1
	* Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
	* Note:
	* nums will have a length in the range [1, 50].
	* Every nums[i] will be an integer in the range [0, 99].
	* @author Azhakesan Thangamuthu
  */

public class ContestCode_LargestNumberTwiceOthers {

	 public int dominantIndex(int[] nums) {
	        
		 //Initialize return value as false
	        int retValue = -1;
	        
	        /*
	        * Logic: Iterate loop and find the largest element in array
	        * Iterate it once more to find seconnd largest element in array
	        * Check if largest element is twice greater than second largest element
	        * If true : return 1 , else return false
	        */
	        
	        /*Store Index of first largest element */
	        int firstLargest =0;
	        
	        for(int i =0 ;i < nums.length-1; i++){
	            
	            if(nums[firstLargest] < nums[i+1]){
	                //Swap index of firstLargest
	                firstLargest = i+1;
	            }
	        }
	        
	        System.out.println(firstLargest);
	        
	        // Iterate and find second largest and skip firstLargest Index
	        
	        
	        //Init secondLargest
	         int secondLargest;
	        if(firstLargest == 0){
	            secondLargest = 1;
	        }else{
	            secondLargest =0;
	        }
	        
	         for(int i =0 ;i < nums.length-1; i++){
	             //Skip First Largest
	           
	             if(i+1 != firstLargest && nums[secondLargest] < nums[i+1]){
	                //Swap index of firstLargest
	                secondLargest = i+1;
	            }
	        
	      }
	        System.out.println(secondLargest);
	        
	        /*Check if number in first largest index greater than or equal to
	        * number at second largest index
	        * if yes, return first largest index  else return -1
	        */
	        if(nums[firstLargest] >= 2 * nums[secondLargest]){
	            retValue = firstLargest;
	        }
	        
	        return retValue;
	    }
}
