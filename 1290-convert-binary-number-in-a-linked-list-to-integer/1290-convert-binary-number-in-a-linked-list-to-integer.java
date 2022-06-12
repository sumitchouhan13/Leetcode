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
    public int getDecimalValue(ListNode head) {
        if(head == null)
            return 0;
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        int binary = 0;
        length = length - 1;
        while(head != null){
            binary = binary + ((int)Math.pow(2 , length) * (head.val));
            head = head.next;
            length--;
        }
        return binary;
    }
}