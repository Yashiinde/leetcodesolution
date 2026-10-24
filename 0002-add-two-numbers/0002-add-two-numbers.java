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
       ListNode list = new ListNode(0);
       ListNode now=l2;
       ListNode curr=l1;
       ListNode head=list;
    //    head=head.next;
       int carry=0;
       while(curr!=null && now!=null){
        int val1=curr.val;
        int val2=now.val;
        int sum=val1+val2+carry;
           head.next=new ListNode(sum % 10);
            carry=sum/10;
        
        curr=curr.next;
        now=now.next;
        head=head.next;
       }
       while(curr!=null){
        int sum=curr.val+carry;
           head.next=new ListNode(sum % 10);
           carry=sum/10;
        curr=curr.next;
        head=head.next;
       }
         while(now!=null){
          int sum=now.val+carry;
           head.next=new ListNode(sum % 10);
           carry=sum/10;
        now=now.next;
        head=head.next;
       }
       if(carry>0){
        head.next=new ListNode(carry);
       }
       return list.next;
    }
}