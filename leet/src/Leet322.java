import java.util.Arrays;

public class Leet322 {
    class Solution {
        private int[] coins;
        private int[][] memo;

        public int coinChange(int[] coins, int amount) {
            this.coins = coins;
            int n = coins.length;
            memo = new int[n][amount + 1];
            for (int[] row : memo) {
                Arrays.fill(row, -1);
            }
            int ans = dfs(n - 1, amount);
            return ans < Integer.MAX_VALUE ? ans : -1;

        }

        //c是剩余金额，i是给出的各种金额的索引
        private int dfs(int i, int c) {
            if (i < 0) {
                return c == 0 ? 0 : Integer.MAX_VALUE / 2;
            }
            if (memo[i][c] != -1) return memo[i][c];
            //当前的这个金额比剩余的大了，就是要超了，那就不要选了
            if (coins[i] > c) {
                memo[i][c] = dfs(i - 1, c);
            }

            return Math.min(dfs(i - 1, c), dfs(i, c - coins[i]) + 1);//不选 选

        }
    }
}
