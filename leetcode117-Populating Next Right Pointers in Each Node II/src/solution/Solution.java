package solution;

public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode pre = null;
        while(root != null){
            TreeLinkNode cur = root;
            pre = null;
            root = null;
            while(cur != null){
                if(cur.left != null){
                    if(pre != null){
                        pre.next = cur.left;
                    }else{
                        root = cur.left;
                    }
                    pre = cur.left;
                }
                if(cur.right != null){
                    if(pre != null){
                        pre.next = cur.right;
                    }else{
                        root = cur.right;
                    }
                    pre = cur.right;
                }
                cur = cur.next;
            }
        }
    }
}
