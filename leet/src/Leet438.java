import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leet438 {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int n = s.length();
            int m = p.length();
            List<Integer> ans = new ArrayList<>();
            int[] pCnt = new int[26];
            int[] sCnt = new int[26];
            for (int i = 0; i < m; i++) {
                pCnt[s.charAt(i) - 'a']++;
            }
            int left = 0;
            for (int right = 0; right < n; right++) {
                int curRight = s.charAt(right) - 'a';
                sCnt[curRight]++;
                while (sCnt[curRight] > pCnt[right]) {
                    int curLeft = s.charAt(left) - 'a';
                    sCnt[curLeft]--;
                    left++;
                }
                if(right - left + 1== p.length()) {
                    ans.add(left);
                }
            }
            return ans;
        }
    }
}
