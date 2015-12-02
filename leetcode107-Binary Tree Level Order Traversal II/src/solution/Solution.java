package solution;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if(root==null) return result;
            Deque<TreeNode> temp = new LinkedList<>();
            temp.offer(root);
            while(!temp.isEmpty()){
                int rowSize = temp.size();
                List<Integer> row = new ArrayList<>();
                
                for(int i=0; i<rowSize; i++){
                    if(temp.peek().left != null) temp.offer(temp.peek().left);
                    if(temp.peek().right != null) temp.offer(temp.peek().right);
                    row.add(temp.pop().val);
                }
                result.add(0,row);
            }
            return result;
        }
}
