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
            if (root == null) {return List.of();}
            List<List<Integer>> res = new LinkedList<>();
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            while(!queue.isEmpty()){
                int n = queue.size();
                List<Integer> list = new ArrayList<>(n);
                while(n-- > 0){
                    TreeNode node = queue.poll();
                    list.add(node.val);
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                }
                res.add(list);
            }
            return res;

        }

    }
}
