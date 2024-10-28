public class Leet55 {
    class Solution {
        public boolean canJump(int[] nums) {
            int n = nums.length;
            int mx = 0;
            for (int i = 0; i < n; i++) {
                if (mx < i) {
                    return false;
                }
                mx = Math.max(mx, nums[i] + i);
            }
            return true;
        }
    }
}
