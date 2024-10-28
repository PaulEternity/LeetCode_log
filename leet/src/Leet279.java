import java.util.Arrays;

public class Leet279 {
    class Solution {
        private static final int[][] memo = new int[101][10001];

        static {
            for (int[] row : memo) {
                Arrays.fill(row, -1);
            }
        }

        private static int dfs(int i, int j) {
            if (i == 0) {
                return j == 0 ? 0 : Integer.MAX_VALUE;
            }
            if (memo[i][j] != -1) return memo[i][j];
            if (j < i * i) {
                return memo[i][j] = dfs(i - 1, j);
            }
            return memo[i][j] = Math.min(dfs(i - 1, j), dfs(i, j - i * i) + 1);
        }

        public int numSquares(int n) {
            return dfs((int) Math.sqrt(n), n);
        }
    }
}
