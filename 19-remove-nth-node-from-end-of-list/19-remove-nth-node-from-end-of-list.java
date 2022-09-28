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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        int dif = count - n;
        if(count == 1){
            return null;
        }
        if(n == count){
            return head.next;
        }
        temp = head;
        ListNode prev = null;
        while(dif-- > 0){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}