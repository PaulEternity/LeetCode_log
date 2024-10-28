public class Leet34 {
    class Solution {

        public int[] searchRange(int[] nums, int target) {
            int start =


        }

        private int lowerBound(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
    }
}
