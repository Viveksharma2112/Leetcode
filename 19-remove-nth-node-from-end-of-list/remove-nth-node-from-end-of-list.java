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
       ListNode dummy = new ListNode(0);
       dummy.next = head;
    //     ListNode slow = dummy; 
    //     ListNode fast = dummy ; 
    //     for(int i = 0 ; i<n ; i++){
    //         fast = fast.next ;
    //     }

    //     while(fast!=null && fast.next!=null){
    //         slow = slow.next ; 
    //         fast = fast.next;
    //     }
    //     slow.next = slow.next.next ; 
    //     return dummy.next;
        

        ListNode temp = dummy;

        int len = 0 ;
        while(temp!= null){
            temp = temp.next ; 
            len++;
        }
        temp= dummy;

        for(int i = 0 ; i<len-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}