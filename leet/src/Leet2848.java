import java.util.HashMap;
import java.util.List;

public class Leet2848 {
    class Solution {
        public int numberOfPoints(List<List<Integer>> nums) {
            int C = 0;
            for (List<Integer> num : nums) {
                C = Math.max(C, num.get(1));
            }
            int[] diff = new int[C + 2];
            for (List<Integer> num : nums) {
                diff[num.get(0)]++;
                diff[num.get(num.size() - 1)]--;
            }
            int ans = 0;
            int diffC = 0;
            for (int d : diff) {
                diffC += d;
                if (diffC == 0) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
