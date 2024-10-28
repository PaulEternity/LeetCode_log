public class Leet26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int cur = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != nums[cur]) {
                    nums[++cur] = nums[i];
                }
            }
            return cur+1;
        }
    }
}
