package solution;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int rowSize = deque.size();
            for(int i=0; i<rowSize; i++){
                if(deque.peek().left != null) deque.offer(deque.peek().left);
                if(deque.peek().right != null) deque.offer(deque.peek().right);
                temp.add(deque.poll().val);
            }
            result.add(temp);
        }
        return result;
    }
}
