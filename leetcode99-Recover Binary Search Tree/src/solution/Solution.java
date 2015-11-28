package solution;

public class Solution {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        traverse(root);
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.left);
        if(first==null && root.val<=pre.val){
            first = pre;
        }
        if(first!=null && root.val<=pre.val){
            second = root;
        }
        pre = root;
        traverse(root.right);
    }
}
