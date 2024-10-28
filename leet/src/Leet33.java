public class Leet33 {
    class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            if (n == 0) return -1;
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            int mini = left;
            left = 0;
            right = n - 1;
            if (target <= nums[right] && target >= nums[mini]) {
                left = mini;
            } else {
                right = mini - 1;
            }
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
}
