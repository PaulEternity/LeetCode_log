import java.util.Arrays;

public class Leet122 {
    class Solution {
        private int[] prices;
        private int[][] memo;

        public int maxProfit(int[] prices) {
            this.prices = prices;
            memo = new int[prices.length][2];
            for (int[] nums : memo) {
                Arrays.fill(nums, -1);
            }
            return dfs(prices.length - 1, 0);
        }

        private int dfs(int i, int j) {
            if (i < 0) {
                return j == 1 ? Integer.MIN_VALUE : 0;
            }
            if (memo[i][j] > 0) {
                return memo[i][j];
            }
            //0是不持有，1是持有
            if (j == 1) {
                return memo[i][j] = Math.max(dfs(i - 1, 1), dfs(i - 1, 0) - prices[i]);
                //继续持有和卖出，卖出就加钱
            }
            return Math.max(dfs(i - 1, 0), dfs(i - 1, 1) + prices[i]);//继续持有和继续不买
        }
    }
}
