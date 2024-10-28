import java.util.ArrayList;
import java.util.List;

public class Leet118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>(numRows);
            ans.add(List.of());
            for (int i = 1; i < numRows; i++) {
                List<Integer> row = new ArrayList<>(i + 1);
                row.add(1);
                for(int j = 1; j < i;j ++){
                    row.add(ans.get(i -1).get(j - 1) + ans.get(i - 1).get(j));//上一行前一列的值和上一行这一列的值
                }
                row.add(1);
                ans.add(row);
            }
            return ans;
        }
    }
}
