public class Leet300 {
    class Solution {
        private int[] nums;
        private int[] memo;

        public int lengthOfLIS(int[] nums) {
            this.nums = nums;
            memo = new int[nums.length];
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                ans = Math.max(ans, dfs(i));
            }
            return ans;
        }

        private int dfs(int i) {
            if (nums[i] > 0) {
                return nums[i];
            }
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    memo[i] = Math.max(memo[i], dfs(j));
                }
            }
            return ++memo[i];
        }

    }
}
