import java.util.HashMap;
import java.util.Map;

public class Leet105 {
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
        int pre_idx;
        int[] preorder;
        int[] inorder;
        Map<Integer, Integer> map = new HashMap<>();

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            this.preorder = preorder;
            this.inorder = inorder;
            pre_idx = 0;
            int idx = 0;
            for (Integer val : inorder) {
                map.put(val, idx++);
            }
            return helper(0, inorder.length - 1);

        }

        public TreeNode helper(int in_left, int in_right) {
            if (in_left > in_right) return null;
            int root_val = preorder[pre_idx++];
            TreeNode root = new TreeNode(root_val);
            int index = map.get(root_val);
            root.left = helper(in_left, index - 1);
            root.right = helper(index + 1, in_right);
            return root;
        }
    }
}
