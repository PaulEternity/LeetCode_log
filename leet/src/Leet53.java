public class Leet53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int[] dp = new int[n];
            int ans = nums[0];
            dp[0] = nums[0];
            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
                ans = Math.max(ans, dp[i]);
            }
            return ans;
        }
    }
}
