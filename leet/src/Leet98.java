public class Leet98 {
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
        public boolean isValidBST(TreeNode root) {
            return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }
        private boolean isValid(TreeNode root, long left, long right) {
            if(root == null){
                return true;
            }
            long num = root.val;
            return left < num && num < right && isValid(root.left,left,num) && isValid(root.right,num,right);
        }

    }
}
