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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        
        slow.next=temp;
        int max=-1;
        fast=slow.next;
        slow=head;
        while(fast!=null){
            System.out.println(slow.val+fast.val);
           max=Math.max(max,slow.val+fast.val);
           slow=slow.next;
           fast=fast.next;
        }
        return max;
    }  
    ListNode reverse(ListNode root){
        System.out.println(root.val);
        ListNode prev=null;
        ListNode curr=root;
        ListNode right=root.next;
        while(right!=null){
            curr.next=prev;
            prev=curr;
            curr=right;
            right=right.next;
        }
        curr.next=prev;
    return curr;
    }
}