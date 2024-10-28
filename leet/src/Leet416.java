import java.util.Arrays;

public class Leet416 {
    class Solution {
        private int[][] memo;
        private int[] nums;

        public boolean canPartition(int[] nums) {
            this.nums = nums;
            int n = nums.length;
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            if (sum % 2 != 0) return false;
            memo = new int[n][sum / 2 + 1];
            for (int[] row : memo) {
                Arrays.fill(row, -1);
            }
            return dfs(n - 1, sum / 2);


        }

        private boolean dfs(int i, int j) {
            if (i < 0) {
                return j == 0;
            }
            if (memo[i][j] != -1) {
                return memo[i][j] == 1;
            }
            boolean res = j >= nums[i] && dfs(i - 1, j - nums[i]) || dfs(i - 1, j);
            memo[i][j] = res ? 1 : 0;
            return res;

        }
    }

}
