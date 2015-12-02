package solution;

public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int lD = minDepth(root.left);
        int rD = minDepth(root.right);
        return (lD==0 || rD==0)? lD+rD+1 : Math.min(lD , rD) +1;
    }
}
