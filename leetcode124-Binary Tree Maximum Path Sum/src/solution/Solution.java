package solution;

public class Solution {
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return result;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));
        result = Math.max(result,left+right+root.val);
        return Math.max(left,right) + root.val;
    }
}
