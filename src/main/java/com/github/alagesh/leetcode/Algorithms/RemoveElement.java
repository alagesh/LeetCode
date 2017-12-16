package com.github.alagesh.leetcode.Algorithms;

/**
Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 @author Azhakesan Thangamuthu
*/
public class RemoveElement {
	
	 public int removeElement(int[] nums, int val) {
	        
	        int count =0;
	        
	        //iterate through array
	        for(int i =0 ;i<nums.length ;i++){
	            // if value doesn't match , overwrite existing array and increment count          
	            if(nums[i] != val){
	                nums[count] = nums[i];
	                count++;
	            }
	        }
	        
	        return count;
	        
	    }

}
