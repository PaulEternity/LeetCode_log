import java.util.Arrays;
import java.util.List;

public class Leet2860 {
    class Solution {
        public int countWays(List<Integer> nums) {
            int []stu = nums.stream().mapToInt(i -> i).toArray();
            Arrays.sort(stu);
            int ans = stu[0] > 0 ? 1:0;
            for (int i = 1; i < stu.length; i++) {
                if (stu[i - 1] < i && i < stu[i]) {
                    ans ++;
                }
            }

            return ans+1;

        }
    }
}
