package com.github.alagesh.leetcode.Algorithms;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListDetectCircle {
    public boolean hasCycle(ListNode head) {
        
        boolean flag = false;
        // Reference : http://codingfreak.blogspot.com/2012/09/detecting-loop-in-singly-linked-list_22.html
       
        /*
        * Logic:
        * Create two pointers : Hare and Tortoise
        * Increment hare pointer by 2 and Tortoise by 1
        * if Hare reaches end of loop -> No Cicular loop
        * If hare  and Tortoise  meets or same - > Circular loop
        */
        
        // The usual, Check for null 
        if(head == null || head.next == null){
            return false;
        }
        
        ListNode tortoise = head;
        ListNode hare = head.next;
        
        while(hare != tortoise){
            
        if(hare == null || hare.next == null || hare.next.next == null){
            return false;   
        }
            //Increment tortoise by 1 pointer and hare by 2
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        
        return true;
        
    }
    
    class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) {
    	          val = x;
    	          next = null;
    	      }
    	 }
}