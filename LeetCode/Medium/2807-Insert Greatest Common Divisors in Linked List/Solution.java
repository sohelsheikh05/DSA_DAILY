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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null && curr.next!=null){
            next=curr.next;
            int gcd=findGcd(curr.val,next.val);
            ListNode temp=new ListNode(gcd);
            curr.next=temp;
            temp.next=next;
            curr=next;
        }
    return head;
    }
    int findGcd(int l,int m){
        int max=Math.max(l,m);
        int min=Math.min(l,m);
        while(min>0){
            int temp=max%min;
            max=min;
            min=temp;
        }
    return max;
    }
}