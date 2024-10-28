import java.util.Queue;

public class Leet189 {
    class Solution {
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            reverse(nums, 0, n);
            reverse(nums, 0, k);
            reverse(nums, k, n);
        }

        private void reverse(int[] nums, int m, int n) {
            int left = m;
            int right = n - 1;
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
}
