import java.util.ArrayList;
import java.util.List;

public class Leet39 {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            backtrack(0, target, 0, candidates);
            return ans;

        }

        private void backtrack(int index, int target, int cur, int[] candidates) {
            int n = candidates.length;
            if (cur == target) {
                ans.add(new ArrayList<>(temp));
                return;
            }
            if (index == n || cur > target) return;
            backtrack(index + 1, target, cur, candidates);

            temp.add(candidates[index]);
            cur += candidates[index];
            backtrack(index, target, cur, candidates);
            temp.remove(temp.size() - 1);


        }
    }
}
