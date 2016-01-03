package solution;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        helper(result,root,0);
        return result;
    }
    public void helper(List<Integer> result, TreeNode root, int dep){
        if(root == null) return;
        if(result.size() == dep) result.add(root.val);
        helper(result,root.right,dep+1);
        helper(result,root.left,dep+1);
    }
}
