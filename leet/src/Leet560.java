public class Leet560 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int n = nums.length;
            int ans = 0;

            for(int left = 0; left < n; left++) {
                int sum = 0;
                for(int right = left; right < n; right++) {
                    sum += nums[right];
                    if(sum == k){
                        ans++;
                    }
                }

            }
            return ans;
        }
    }
}
