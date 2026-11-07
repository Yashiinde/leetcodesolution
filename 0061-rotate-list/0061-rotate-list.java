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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        temp.next=head;;
        int i=k%size;
        int idx=size-i;
        ListNode dummy=temp;
        while(idx>0){
            dummy=dummy.next;
            idx--;
        }
        ListNode newnode=dummy.next;
        dummy.next=null;
        return newnode;
    }
}