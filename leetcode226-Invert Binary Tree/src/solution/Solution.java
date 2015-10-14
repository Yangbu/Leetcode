package solution;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode right  = root.right;
        TreeNode left = root.left;
        
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
