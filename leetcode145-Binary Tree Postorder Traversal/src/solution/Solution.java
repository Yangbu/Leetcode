package solution;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null){
            result.add(root.val);
            if(root.left != null) stack.push(root.left);
            root = root.right;
            if(root == null && !stack.isEmpty()) root = stack.pop();
        }
        Collections.reverse(result);
        return result;
    }
}
