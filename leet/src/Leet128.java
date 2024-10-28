import java.util.HashSet;
import java.util.Set;

public class Leet128 {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> setNum = new HashSet<Integer>();
            int longestArray = 0;
            for (int num : nums) {
                setNum.add(num);
            }
            for (int num : setNum) {
                if (!setNum.contains(num - 1)) {
                    int currentNum = num;
                    int currentArray = 1;
                    while (setNum.contains(currentNum + 1)) {
                        currentArray += 1;
                        currentNum += 1;

                    }
                    longestArray = Math.max(longestArray, currentArray);
                }


            }
            return longestArray;
        }
    }
}
