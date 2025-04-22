public class Leet740 {
    class Solution {
        public int deleteAndEarn(int[] nums) {
            int mx = 0;
            for(int num : nums){
                mx = Math.max(mx,num);
            }
            int[] dp = new int[mx + 1];
            for(int num : nums){
                dp[num] += num;
            }
            return rob(dp);
        }
        private int rob(int[] nums){
            int f0 = 0;
            int f1 = 0;
            for(int x : nums){
                int newF = Math.max(f1,f0+x);
                f0 = f1;
                f1 = newF;
            }
            return f1;
        }
    }
}
