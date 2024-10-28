import java.util.ArrayList;
import java.util.List;

public class Leet994 {
    class Solution {
        private static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        public int orangesRotting(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int fresh = 0;
            List<int[]> p = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        fresh ++;
                    }else if(grid[i][j] == 2){
                        p.add(new int[]{i, j});
                    }
                }
            }
            int ans = -1;
            while(!p.isEmpty()){
                ans ++;
                List<int[]> list = p;
                p = new ArrayList<>();
                for (int[] pos : list){
                    for(int[]d : DIRS){
                        int i = pos[0] + d[0];
                        int j = pos[1] + d[1];
                        if(0 <= i && i < m && 0 <= j && j < n && grid[i][j] == 1){
                            fresh--;
                            grid[i][j] = 2;
                            p.add(new int[]{i, j});
                        }
                    }
                }
            }
            return fresh > 0 ? -1 : Math.max(0,ans);
        }

    }
}
