/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int count = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode node = removeFromEnd(head, n);
        if(n == count + 1){
            return node.next;
        }
        return node;
    }
    
    public ListNode removeFromEnd(ListNode head, int n){
        if(head.next == null){  
            return head;
        }
       
        ListNode next = removeFromEnd(head.next, n);
        count++;
        
        if(count == n){
            head.next = next.next;
        }
        return head;
    }
}