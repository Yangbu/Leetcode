package solution;

/*
 * It's recursive and expands the meaning of the function. 
 * If the current (sub)tree contains both p and q, then the function 
 * result is their LCA. If only one of them is in that subtree, 
 * then the result is that one of them. If neither are in that subtree, the result is null/None/nil.
 * 
 * 
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p==root || q == root){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        return left==null? right:right==null? left:root;
        
    }
}
