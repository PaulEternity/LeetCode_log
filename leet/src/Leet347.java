import java.util.*;

public class Leet347 {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int num : nums){
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o1) - map.get(o2);
                }
            });
            for (Integer key : map.keySet()) {
                if (pq.size() < k) {
                    pq.add(key);
                } else if (map.get(key) > map.get(pq.peek())) {
                    pq.remove();
                    pq.add(key);
                }
            }
            List<Integer> ans = new ArrayList<>();
            while (!pq.isEmpty()) {
                ans.add(pq.remove());
            }
            int[] res = new int[ans.size()];
            for (int i = 0; i < res.length; i++) {
                res[i] = ans.get(i);
            }
            return res;
        }
    }
}
