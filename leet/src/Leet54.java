import java.util.ArrayList;
import java.util.List;

public class Leet54 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int n = matrix.length;
            int m = matrix[0].length;
            int right = m - 1;
            int left = 0;
            int top = 0;
            int bottom = n - 1;
            while (true) {
                for (int i = left; i <= right; i++) {
                    res.add(matrix[top][i]);
                }
                if (++top > bottom) {
                    break;
                }
                for (int i = top; i <= bottom; i++) {
                    res.add(matrix[i][right]);
                }
                if (--right < left) {
                    break;
                }
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                if (--bottom < top) {
                    break;
                }
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                if (++left > right) {
                    break;
                }
            }
            return res;
        }
    }
}
