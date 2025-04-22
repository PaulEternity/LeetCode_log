public class Leet796 {
    class Solution {
        public boolean rotateString(String s, String goal) {
            int n = s.length();
            int m = goal.length();
            if (m != n) {
                return false;
            }
            for (int i = 0; i < m; i++) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (s.charAt((i + j) % n) != goal.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }
            return false;
        }
    }
}
