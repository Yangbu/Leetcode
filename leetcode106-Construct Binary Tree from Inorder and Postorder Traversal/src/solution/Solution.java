package solution;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1,0,inorder.length-1,inorder,postorder);
    }
    public TreeNode helper(int postEnd, int inStart, int inEnd, int[] inorder, int[] postorder){
        if(postEnd<0|| inStart>inEnd) return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = -1;
        for(int i=inStart; i<=inEnd; i++){
            if(inorder[i]==root.val){
                inRoot = i;
                break;
            }
        }
        root.left = helper(postEnd-(inEnd-inRoot+1), inStart, inRoot-1, inorder, postorder);
        root.right = helper(postEnd-1, inRoot+1, inEnd, inorder, postorder);
        return root;
    }
}
