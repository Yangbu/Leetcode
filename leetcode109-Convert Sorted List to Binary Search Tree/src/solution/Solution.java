package solution;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return helper(head,null);
    }
    public TreeNode helper(ListNode start, ListNode end){
        if(start==end) return null;
        ListNode fast = start, slow = start;
        while(fast.next != end && fast.next.next != end){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(start, slow);
        root.right = helper(slow.next, end);
        return root;
    }
}
