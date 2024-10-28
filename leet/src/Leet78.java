import java.util.ArrayList;
import java.util.List;

public class Leet78 {
    class Solution {
        private final List<List<Integer>> ans = new ArrayList<>();
        private final List<Integer> tmp = new ArrayList<>();
        private int[] nums;

        public List<List<Integer>> subsets(int[] nums) {
            this.nums = nums;
            backtrack(0);
            return ans;
        }
        private void backtrack(int i){
            if(i == nums.length){
                ans.add(new ArrayList<>(tmp));
                return;
            }
            //两个分支，一个跳过当前的数，去下一个数
            //另一个把现在的数字加上
            backtrack(i+1);

            tmp.add(nums[i]);
            backtrack(i+1);
            tmp.remove(tmp.size()-1);
        }


    }
}
