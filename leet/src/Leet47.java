import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet47 {
    class Solution {
        boolean[] vis;

        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> evry = new ArrayList<>();
            vis = new boolean[nums.length];
            Arrays.sort(nums);
            backtrack(nums, ans, 0, evry);
            return ans;
        }

        public void backtrack(int[] nums, List<List<Integer>> ans, int index, List<Integer> evry) {
            int n = nums.length;
            if (index == n) {
                ans.add(new ArrayList<Integer>(evry));
                return;
            }
            for (int i = 0; i < n; i++) {
                if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                    continue;
                }
                evry.add(nums[i]);
                vis[i] = true;
                backtrack(nums, ans, index + 1, evry);
                vis[i] = false;
                evry.remove(index);
            }

        }
    }
}
