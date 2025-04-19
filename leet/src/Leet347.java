import java.util.*;

public class Leet347 {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            List<Integer> result = new ArrayList<>();
            Map<Integer,Integer> map = new HashMap<>();
            for(int num : nums){
                if(map.containsKey(num)){
                    map.put(num,map.get(num)+1);
                }else{
                    map.put(num,1);
                }
            }
            List<Integer>[] list = new List[nums.length+1];
            for(int key : map.keySet()){
                int i = map.get(key);
                if(list[i] == null){
                    list[i] = new ArrayList<>();
                }
                list[i].add(key);
            }
            for(int i=list.length-1;i >= 0 && result.size() < k;i--){
                if(list[i] == null)continue;
                result.addAll(list[i]);
            }
            int[] ans = new int[result.size()];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = result.get(i);
            }
            return ans;
        }
    }
}