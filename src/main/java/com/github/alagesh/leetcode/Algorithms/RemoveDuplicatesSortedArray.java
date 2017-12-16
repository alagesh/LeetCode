package com.github.alagesh.leetcode.Algorithms;

/**
 Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 @author Azhakesan Thangamuthu
*/

public class RemoveDuplicatesSortedArray {

	 public int removeDuplicates(int[] nums) {
	        int count=0;    
	        //Check condition for array size 1
	        if(nums.length == 1){ 
	            //Handling : Array of Size 1 is an array without duplicates
	            count++;
	        }
	        
	        //Array's with length less than 1 are with non duplicates
	        if(nums.length > 1){        
	        
	        for(int i=0; i<nums.length-1; i++){
	            
	            if(nums[i] != nums[i+1])
	            {
	                //Overwrite same array but with different index
	                nums[count]=nums[i];
	                count++;
	            }
	         }    
	         //Add last element to count to avoid array out of bound exception in comparision
	         nums[count] = nums[nums.length-1];
	         count++;
	        }
	        
	       
	        
	        return count;   
	        
	    }
}
