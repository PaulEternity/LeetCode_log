import java.util.Arrays;

public class Leet198 {
    class Solution {
        private int[] memo;
        private int[] nums;

        public int rob(int[] nums) {
            this.nums = nums;
            int n = nums.length;
            memo = new int[n];
            Arrays.fill(memo, -1);
            return dfs(n - 1);


        }

        private int dfs(int n) {
            if (n < 0) return 0;
            if (memo[n] != 0) return memo[n];
            int res = Math.max(dfs(n - 1), (dfs(n - 2) + nums[n]));
            memo[n] = res;
            return res;

        }
    }
}
