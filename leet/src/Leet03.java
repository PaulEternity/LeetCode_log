import java.util.HashMap;
import java.util.Map;

public class Leet03 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int res = 0;
            int n = s.length();
            for(int start = 0, end = 0;end<n;end ++){
                int num = s.charAt(end);
                if(map.containsKey(num)){
                    start = Math.max(start,map.get(num));
                }
                map.put(s.charAt(start), end);
                res = Math.max(res,end-start+1);
            }
            return res;
        }
    }
}
