public class Leet48 {
    class Solution {
        public void rotate(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            for (int i = 0; i < m/2; i++) {
                for (int j = 0; j < (n+1)/2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[m-1-j][i];
                    matrix[m-1-j][i] = matrix[m-1-i][n-1-j];
                    matrix[m-1-i][n-1-j] = matrix[j][m-1-i];
                    matrix[j][m-1-i] = temp;
                }
            }

        }
    }

}
