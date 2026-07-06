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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode curr = (fast==null)?slow:slow.next;

        while(curr!=null){
            stack.push(curr.val);
            curr= curr.next;
        }

        curr = head;
        while(!stack.isEmpty()){
            if(curr.val!=stack.pop()){
                return false;
            }
            curr = curr.next;
        }

        return true;
    }
}