public class Leet213 {
    class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            return Math.max(nums[0]+rob1(nums,2,n-1),rob1(nums,1,n));

        }
        private int rob1(int[] nums,int start,int end){
            int f0 = 0;
            int f1 = 0;
            for(int i=start;i<end;i++){
                int newF = Math.max(f1,f0+nums[i]);
                f0 = f1;
                f1 = newF;
            }
            return f1;
        }

    }
}
