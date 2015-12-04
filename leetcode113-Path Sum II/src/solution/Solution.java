package solution;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(root,sum,result,temp);
        return result;
    }
    public void helper(TreeNode root, int sum, List<List<Integer>> result , List<Integer> temp){
        if(root == null) return;
        temp.add(root.val);
        if(root.left==null && root.right==null && sum==root.val){
            result.add(new ArrayList<>(temp));
        }else{
        helper(root.left,sum-root.val,result,temp);
        helper(root.right,sum-root.val,result,temp);
        }
        temp.remove(temp.size()-1);
        
    }
}
