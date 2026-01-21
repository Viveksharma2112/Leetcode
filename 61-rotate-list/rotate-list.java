class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // 1. Edge Cases: Agar list khali hai ya rotate nahi karna
      if(head==null || head.next==null || k==0){
        return head ;
      }

      ListNode tail = head ;
      int len = 1 ; 

      while(tail.next!=null){
        tail = tail.next;
        len++;
      }

      k = k%len;
      if(k==0) return head;
      tail.next = head ; 

      int step = len-k;

      ListNode temp = tail ; 
      while(step > 0){
        temp = temp.next ; 
        step--;
      }

      ListNode newhead = temp.next ; 
      temp.next = null;

      return newhead;
    }
}