package solutioin;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetric(root.left, root.right);
    }
    public boolean isSymmetric(TreeNode l, TreeNode r){
        if(l==null || r==null) return l==r;
        if(l.val != r.val) return false;
        return isSymmetric(l.left, r.right) && isSymmetric(l.right, r.left);
    }
}
