package solution;

/*
 * Just walk down from the whole tree's root as long as both p and q are in the same 
 * subtree (meaning their values are both smaller or both larger than root's). 
 * This walks straight from the root to the LCA, not looking at the rest of the tree, 
 * so it's pretty much as fast as it gets. A few ways to do it:
 * 
 * 
 * 
 * 
 */
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    while ((root.val - p.val) * (root.val - q.val) > 0)
	        root = p.val < root.val ? root.left : root.right;
	    return root;
	}
}
