import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet46 {
    class Solution {
        boolean[] vis;

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> evry = new ArrayList<>();
            vis = new boolean[nums.length];
            Arrays.sort(nums);
            backTrack(ans, nums, 0, evry);
            return ans;

        }

        private void backTrack(List<List<Integer>> ans, int[] nums, int index, List<Integer> evry) {
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
                backTrack(ans, nums, index + 1, evry);
                vis[i] = false;
                evry.remove(index);

            }

        }
    }
}
