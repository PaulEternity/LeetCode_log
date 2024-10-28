public class Leet543 {
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
        private int ans = 0;//记录最终答案
        public int diameterOfBinaryTree(TreeNode root) {
            findDiameter(root);
            return ans;
        }
        private int findDiameter(TreeNode root) {
            if (root == null) return -1;
            int left = findDiameter(root.left) + 1;
            int right = findDiameter(root.right) + 1;
            ans = Math.max(ans,left + right);//记录直径最大值
            return Math.max(left,right); //递归用到这个返回值，答案不是它

        }
    }
}
