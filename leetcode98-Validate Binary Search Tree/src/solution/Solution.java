package solution;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> result = new Stack<>();
        TreeNode pre = null;
        TreeNode cur = root;
        while(cur!=null || !result.isEmpty()){
            while(cur!=null){
                result.push(cur);
                cur = cur.left;
            }
            TreeNode node = result.pop();
            if(pre!=null && pre.val>=node.val) return false;
            pre = node;
            cur = node.right;
        }
        return true;
    }
}
