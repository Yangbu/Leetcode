package solution;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next == null || k==0) return head;
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode fast = result, slow = result;
        int len=0;
        while(fast.next != null){
            fast = fast.next;
            len++;
        }
        for(int i=len-k%len; i>0; i--){
            slow = slow.next;
        }
        fast.next = result.next;
        result.next = slow.next;
        slow.next = null;
        
        return result.next;
    }
}
