package solution;

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<TreeNode>();
        return helper(1,n);
        
    }
    public List<TreeNode> helper(int start , int end){
        List<TreeNode> result = new ArrayList<>();
        if(start>end){
            result.add(null);
            return result;
        }else if(start==end){
            TreeNode node = new TreeNode(start);
            result.add(node);
            return result;
        }else{
            for(int i=start; i<=end; i++){
                List<TreeNode> left = helper(start, i-1);
                List<TreeNode> right = helper(i+1, end);
                for(TreeNode l : left){
                    for(TreeNode r:right){
                        TreeNode root = new TreeNode(i);
                        root.left = l;
                        root.right = r;
                        result.add(root);
                    }
                }
            }
        }
        return result;
    }
}
