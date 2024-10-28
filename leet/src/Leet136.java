import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leet136 {
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int ans = 0;
            for (int j : nums) {
                if (map.containsKey(j)) {
                    map.put(j, map.get(j) + 1);
                } else {
                    map.put(j, 1);
                }

            }
            for (int num : nums) {
                if (map.get(num) == 1) {
                    ans = num;
                }
            }
            return ans;
        }
    }
}
