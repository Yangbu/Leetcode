/**
 * 
 */
package solution;

/**
 * 3 line recursive solution
 *
 */
public class Solution {
	public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
}
}
