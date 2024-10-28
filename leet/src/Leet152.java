public class Leet152 {
    class Solution {
        public int maxProduct(int[] nums) {
            int n = nums.length;
            int max = nums[0];
            int curMax = 1, curMin = 1;
            for (int i = 1; i < n; i++) {
                if(nums[i] < 0){
                    int temp = curMax;
                    curMax = curMin;
                    curMin = temp;
                }
                curMax = Math.max(curMax * nums[i], nums[i]);
                curMin = Math.min(curMin * nums[i], nums[i]);
                max = Math.max(max, curMax);
            }
            return max;
        }
    }
}
