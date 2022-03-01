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
        // not have to reverse solution
//         ListNode dummy = new ListNode(0,head);
//         ListNode left = dummy;
//         ListNode right = head;
        
//         while(n > 0 && right != null){
//             right = right.next;
//             n -=1;
//         }
//         while(right !=null){
//             left = left.next;
//             right = right.next;
//         }
//         left.next = left.next.next;
//         return dummy.next;
      
        ListNode firstReversedHead = reverse(head);
        ListNode prev = new ListNode(0,firstReversedHead);
        ListNode current = firstReversedHead;
        for(int i = 1; i <= n; i++){
           if(n == 1){
              firstReversedHead = current.next;
               break;
           }
            else if(i == n && i > 1){
                prev.next = current.next;
                break;
            }
            prev = prev.next;
            current = current.next;
        }
        ListNode secHead = reverse(firstReversedHead);
     return   secHead;
        
    }
     private ListNode reverse(ListNode h){
            ListNode prev = null;
            ListNode current = h;
            while(current != null){
                ListNode temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            return prev;
        }
}