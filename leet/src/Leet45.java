public class Leet45 {
    class Solution {
        public int jump(int[] nums) {
            int curRight = 0;
            int nextRight = 0;
            int ans = 0;
            for(int i = 0; i < nums.length - 1; i++){
                nextRight = Math.max(i + nums[i], nextRight);
                if(i == curRight){
                    curRight = nextRight;
                    ans ++;
                }
            }
            return ans;
        }
    }
}
