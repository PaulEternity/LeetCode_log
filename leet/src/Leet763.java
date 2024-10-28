import java.util.ArrayList;
import java.util.List;

public class Leet763 {
    class Solution {
        public List<Integer> partitionLabels(String s) {
            char[] chars = s.toCharArray();
            int n = chars.length;
            List<Integer> res = new ArrayList<>();
            int[] last = new int[26];
            for (int i = 0; i < n; i++) {
                last[chars[i] - 'a'] = i;
            }
            int start = 0;
            int end = 0;
            for (int i = 0; i < n; i++) {
                end = Math.max(end,last[chars[i] - 'a']);
                if(end == i){
                    res.add(end - start + 1);
                    start = i + 1;
                }
            }
            return res;
        }
    }
}
