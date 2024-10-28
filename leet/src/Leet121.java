public class Leet121 {
    class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            if (n == 0) return 0;
            if (n == 1) return 0;
            int minPrice = prices[0];
            int ans = 0;
            for (int i = 1; i < n; i++) {
                minPrice = Math.min(minPrice, prices[i]);
                ans = Math.max(ans, prices[i] - minPrice);
            }
            return ans;

        }
    }
}
