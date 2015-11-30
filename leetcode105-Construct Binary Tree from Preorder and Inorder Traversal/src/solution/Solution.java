package solution;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);
    }
    public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart>preorder.length || inStart>inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = -1;
        for(int i=inStart; i<=inEnd; i++){
            if(inorder[i]==root.val){
                inRoot = i;
                break;
            }
        }
        root.left = helper(preStart+1,inStart,inRoot-1,preorder,inorder);
        root.right = helper(preStart+inRoot-inStart+1, inRoot+1,inEnd, preorder,inorder);
        return root;
    }
}
