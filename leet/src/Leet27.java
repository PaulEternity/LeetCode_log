public class Leet27 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int n = nums.length;
            int cnt = 0;
            int cur = 0;
            while (cur < n) {
                if (nums[cur] == val) {
                    nums[cur++] = nums[cur + 1];
                }
            }
            return cur + 1;

        }
    }
}
