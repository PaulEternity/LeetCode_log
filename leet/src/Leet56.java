import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet56 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            List<int[]>ans = new ArrayList<>();
            Arrays.sort(intervals,(p,q)->p[0]-q[0]); //按照左端点从大到小排序
            for(int[] n : intervals){
                int m = ans.size();
                if(m > 0 && n[0] <=  ans.get(m-1)[1]){
                    ans.get(m-1)[1] = Math.max(ans.get(m-1)[1],n[1]);
                } else{
                    ans.add(n);
                }
            }
            return ans.toArray(new int[ans.size()][]);
        }
    }
}
