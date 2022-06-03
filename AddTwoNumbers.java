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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode ptr=head;
        int sum=0;
        while (l1!=null || l2!=null){
            sum/=10;
            if (l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            if (l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            ptr.next=new ListNode(sum%10);
            ptr=ptr.next;
        }
        if (sum/10==1)
            ptr.next=new ListNode(1);
        return head.next;
    }
}
