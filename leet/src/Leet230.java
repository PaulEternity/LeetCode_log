import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet230 {
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
        List<Integer> list = new ArrayList<>();
        public int kthSmallest(TreeNode root, int k) {
            DFS(root);
            Collections.sort(list);
            return list.get(k-1);
        }
        private void DFS(TreeNode root){
            if(root == null){
                return ;
            }
            list.add(root.val);
            DFS(root.left);
            DFS(root.right);
        }
    }

}
