package solution;

public class Solution {
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode result = stack.pop();
        if(result.right != null) pushAll(result.right);
        return result.val;
    }
    public void pushAll(TreeNode root){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }
}
