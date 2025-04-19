import java.util.*;

public class Leet102 {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) {
                return new ArrayList<List<Integer>>();
            }
            dfs(1, root, res);
            return res;
        }
        private void dfs(int index,TreeNode root, List<List<Integer>> res) {
            if(index > res.size()) {
                res.add(new ArrayList<Integer>());
            }
            res.get(index-1).add(root.val);
            if(root.left != null) {
                dfs(index+1, root.left, res);
            }
            if(root.right != null) {
                dfs(index+1, root.right, res);
            }

        }

    }
}
