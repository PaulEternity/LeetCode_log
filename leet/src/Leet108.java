public class Leet108 {
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
        public TreeNode sortedArrayToBST(int[] nums) {
            return dfs(nums, 0, nums.length);
        }

        private TreeNode dfs(int[] nums, int left, int right) {
            if (left == right) {
                return null;
            }
            //转换成二进制之后右移一位（打比方就是从2的3次方右移到了2的2次方，相当于除2
            //这种方法不会出现整数溢出
            //>>>是无符号运算  >>是有符号运算
            int m = (left + right) >>> 1;
            return (new TreeNode(nums[m], dfs(nums, left, m), dfs(nums, m + 1, right)));

        }
    }
}
