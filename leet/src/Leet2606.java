public class Leet2606 {
    class Solution {
        public int maximumCostSubstring(String s, String chars, int[] vals) {
            int[] mapping = new int[26];
            for (int i = 0; i < 26; i++) {
                mapping[i] = i + 1;
            }
            for (int i = 0; i < vals.length; i++) {
                mapping[chars.charAt(i) - 'a'] = vals[i];
            }
            int ans = 0;
            int f = 0;
            for (char c : s.toCharArray()) {
                f = Math.max(f, 0) + mapping[c - 'a'];
                ans = Math.max(ans, f);
            }
            return ans;
        }
    }
}
