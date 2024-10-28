import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leet199 {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            dfs(root,res,0);
            return res;
        }
        private void dfs(TreeNode node,List<Integer> res,int sz){
            if(node == null){return;}
            if(sz == res.size()){
                res.add(node.val);
            }
            dfs(node.right,res,sz+1); //全部都递归，然后根据条件判断
            dfs(node.left,res,sz+1);
        }
    }
}
