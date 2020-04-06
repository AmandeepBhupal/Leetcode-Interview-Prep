/*
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //Java Implementation
 
class Solution {
    
    public boolean isPalindrome(ListNode head) {
       int flag=0;
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp; 
        }
        
        ListNode curr=prev;
        if(fast!=null)
            slow=slow.next;
        while(slow!=null && curr!=null){
            if(slow.val!=curr.val)
                return false;
            else{
                slow=slow.next;
                curr=curr.next;
        
            }
        }
        return true;
    }
}
