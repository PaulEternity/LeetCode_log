public class Leet79 {
    class Solution {
        private static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            char[] c = word.toCharArray();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (dfs(board, 0, i, j, c)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean dfs(char[][] board, int cnt, int x, int y, char[] c) {
            if (cnt == c.length) { //和要找的已经一致了
                return true;
            }
            if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != c[cnt]) {
                return false;
            }
            char temp = board[x][y];
            board[x][y] = '#'; //标记访问过
            for (int[] dir : DIRS) {
                int i = x + dir[0];
                int j = y + dir[1];
                if (dfs(board, cnt + 1, i, j, c)) {
                    return true;
                }
            }
            board[x][y] = temp;//恢复
            return false;
        }
    }
}
