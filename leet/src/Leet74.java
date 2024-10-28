public class Leet74 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int left = -1;
            int right = m * n;
            while (left + 1 < right) {
                int mid = (left + right) >>> 1;
                int x = matrix[mid / n][mid % n];
                if (x == target) {
                    return true;
                } else if (x < target) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
            return false;

        }
    }
}
