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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode mark = dummyHead , prev = null , follow = null , curr = head;
        for(int i = 1 ; i < left ; i++){
            mark = curr;
            curr = curr.next;
        }
        for(int j = 1 ; j < right - left + 1 ; j++){
            follow = curr.next;
            curr.next = prev;
            prev = curr;
            curr = follow;
        }
        mark.next.next = curr.next;
        curr.next = prev;
        mark.next = curr;
        return dummyHead.next;
    }
}