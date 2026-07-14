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
    public ListNode middleNode(ListNode head) {
        //  ListNode fast = head;
        // ListNode slow = head;
        // while(fast!=null && fast.next !=null){
        //     slow = slow.next ; 
        //     fast = fast.next.next;

        // }
        // return slow;

        int num = 0 ; 
        ListNode temp = head ; 
        ListNode t = head;
        while(temp!=null){
            temp = temp.next;
            num++;
        }
      for(int i = 0 ; i<num/2;i++){
        t = t.next;
      }
      return t;
    }
}