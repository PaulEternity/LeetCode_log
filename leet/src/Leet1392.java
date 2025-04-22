public class Leet1392 {
    class Solution {
        public String longestPrefix(String s) {
            int n = s.length();
            char[] chars = s.toCharArray();
            int i = 0;
            int j = -1;
            int[] next = new int[n + 1];
            next[0] = -1;
            while (i < n) {
                if (j == -1 || s.charAt(i) == s.charAt(j)) {
                    j++;
                    i++;
                    next[i] = j;
                }else{
                    j=next[j];
                }
            }
            return s.substring(0, next[n]);
        }
    }
}
