import java.util.Arrays;

public class Leet977 {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            Arrays.sort(nums);
            int [] res = new int[nums.length];
            int j = nums.length - 1;
            int i = 0;
            int k = nums.length - 1;
            while (i <= j || k == 0){
                if(Math.abs(nums[i])>=Math.abs(nums[j])){
                    res[k] = nums[i] * nums[i];
                    i++;
                }
                else{
                    res[k] = nums[j] * nums[j];
                    j--;
                }
                k--;
            }
        return res;
        }
    }
}
