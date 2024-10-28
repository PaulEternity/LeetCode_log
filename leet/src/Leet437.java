import java.util.HashMap;
import java.util.Map;

public class Leet437 {
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
        private int ans;
        public int pathSum(TreeNode root, int targetSum) {
            Map<Long,Integer> map = new HashMap<>();
            map.put(0L,1);
            dfs(root,0,targetSum,map);
            return ans;
        }
        private void dfs(TreeNode root, long s, int targetSum, Map<Long,Integer> cnt){
            if(root==null) return;
            s += root.val;
            ans += cnt.getOrDefault(s - targetSum, 0);
            cnt.merge(s,1,Integer :: sum);
            dfs(root.left,s,targetSum,cnt);
            dfs(root.right,s,targetSum,cnt);
            cnt.merge(s,-1,Integer:: sum);


        }
    }
}
