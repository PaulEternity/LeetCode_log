public class Leet80 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            return process(nums,2);
        }

        //变成前k个保留
        int process(int[] nums, int k) {
            int i = 0;
            for (int x : nums) {
                if (i < k || nums[i - k] != x) {
                    nums[i++] = x;
                }
            }
            return i;
        }
    }
}
