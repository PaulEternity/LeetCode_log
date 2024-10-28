import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet1027 {
    class Solution {
       private  int ans;
       private int[] nums;
       private HashMap<Integer, Integer>[] map;
        public int longestArithSeqLength(int[] nums) {
            this.nums = nums;
            int n = nums.length;
            map = new HashMap[n];
            for (int i = 0; i < n; i++) {
                dfs(i);
            }
            return ans;
        }
        private Map<Integer,Integer> dfs(int i){
            if(map[i] != null){
                return map[i];
            }
            map[i] = new HashMap<>();
            for(int j = i - 1; j >=0;j--){
                int d = nums[i] - nums[j];
                if(!map[i].containsKey(d)){
                    map[i].put(d,dfs(j).getOrDefault(d,1)+1);
                    ans = Math.max(ans,map[i].get(d));
                }
            }
            return map[i];
        }
    }
}
