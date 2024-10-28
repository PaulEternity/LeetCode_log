import java.util.ArrayList;
import java.util.List;

public class Leet114 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public void flatten(TreeNode root) {
            while(root != null) {
                if (root.left == null) {
                    root = root.right;
                }
                TreeNode pre = root.left;
                while(pre.right != null){
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
    }
}
