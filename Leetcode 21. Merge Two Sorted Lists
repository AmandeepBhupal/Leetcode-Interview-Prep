/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //Java implementation
 
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(-1);
        ListNode ans=result;
        while(l1!=null && l2!=null){
            
            
            
            if(l1.val<=l2.val){
                result.next=l1;
                l1=l1.next;
                
            }
            else{
                result.next=l2;
                l2=l2.next;
                
            }
            
            result=result.next;
            
            
        }
        if(l1!=null) result.next=l1;
        else if(l2!=null) result.next=l2;
        return ans.next;
    }
}
