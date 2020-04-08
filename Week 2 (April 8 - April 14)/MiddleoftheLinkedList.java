/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null)
            return head;
        if(head.next.next==null)
            return head.next;
        if(head.next.next.next==null)
            return head.next;
        ListNode ret;
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(count/2==1){
            count/=2-1;
        }
        else{
            count=count/2;
        }
        ret=head;
        while(count>0){
            count--;
            ret=ret.next;
        }
        return ret;
    }
}