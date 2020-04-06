/*
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> q=new PriorityQueue<>((a,b) -> (a.val-b.val));
        
        for(ListNode node:lists){
            if(node!=null) q.offer(node);
        }
        
        ListNode result=new ListNode(-1);
        ListNode ans=result;
        
        while(!q.isEmpty()){
            ListNode temp=q.poll();
            result.next=temp;
            if(temp.next!=null) q.offer(temp.next);
            result=result.next;
        }
        return ans.next;
    }
}

