package solution;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result,root,0);
        return result;
    }
    public void helper(List<List<Integer>> result, TreeNode root, int level){
        if(root==null) return;
        if(result.size() <= level){
            List<Integer> temp = new ArrayList<>();
            result.add(temp);
        }
        List<Integer> l = result.get(level);
        if(level%2==0) l.add(root.val);
        else l.add(0,root.val);
        
        helper(result,root.left,level+1);
        helper(result,root.right,level+1);
        
    }
}
