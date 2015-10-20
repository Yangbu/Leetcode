package solution;

import java.awt.List;
import java.util.ArrayList;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null) return result;
        helper(root,"",result);
        return result;
        
    }
    public void helper(TreeNode root, String path ,List<String> answer ){
        if(root.left == null && root.right == null) answer.add(path+root.val);
        if(root.left != null) helper(root.left, path+root.val+"->", answer);
        if(root.right != null) helper(root.right, path+root.val+"->", answer);
    }
}
