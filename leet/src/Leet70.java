public class Leet70 {
    class Solution {
        public int climbStairs(int n) {
            int[] dp = new int[n + 1];
            return dfs(n, dp);
        }

        private int dfs(int n, int[] dp) {
            if (n <= 1) {
                return 1;
            }
            if (dp[n] != 0) {
                return dp[n];
            }
            return dp[n] = dfs(n - 1, dp) + dfs(n - 2, dp);
        }
    }
}
