package com.github.alagesh.leetcode.Algorithms;

public class LinkedListRemoveElements {

	/*
	* Remove all elements from a linked list of integers that have value val.
    *
	* Example
	* Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
	* Return: 1 --> 2 --> 3 --> 4 --> 5
	*  
	* @author Azhakesan Thangamuthu
	*/
public ListNode removeElements(ListNode head, int val) {
        
        /*Logic:
        * Iterate through the linkedlist
        * Compare current node -> next.value equals input value
        * if matches, set current node next to next.next
        * finally check if head value matches with input value and reassign head if matches
        */
        
        /*
         * Missed Null pointer check in previous submission
         */ 
        if(head == null){
            return null;
        }
        
        ListNode current = head;     
        
        while(current.next != null){
          
            //  System.out.println(current.val);
            if(current.next.val == val){
                //If value matches , remove node by pointing to next next node
                current.next = current.next.next;
            }else{
            //Iterate loop
            current = current.next;            
         }
        }
        //Check if head value matches input value and adjust head accordingly
        if(head.val == val){
            head = head.next;
        }
        
        return head;
        
    }

public class ListNode {
	      int val;
	      ListNode next;
	 }
}
