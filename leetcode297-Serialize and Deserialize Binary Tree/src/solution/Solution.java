package solution;

public class Solution {
    private static final String spliter = ",";
    private static final String Null = "N";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        buildString(root,result);
        return result.toString();
    }
    public void buildString(TreeNode root , StringBuilder result){
        if(root == null) result.append(Null+spliter);
        else {
            result.append(root.val+spliter);
            buildString(root.left,result);
            buildString(root.right,result);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> deque = new LinkedList<>();
        deque.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(deque);
    }
    public TreeNode buildTree(Deque<String> deque){
        String cur = deque.poll();
        if(cur.equals(Null)) return null;
        TreeNode root = new TreeNode(Integer.parseInt(cur));
        root.left = buildTree(deque);
        root.right = buildTree(deque);
        return root;
    }
}
