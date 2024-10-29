import java.util.ArrayList;
import java.util.List;

public class Leet3211 {
    class Solution {
        public List<String> validStrings(int n) {
            List<String> res = new ArrayList<>();
            char[] chars = new char[n];
            dfs(0, n, res, chars);
            return res;
        }

        private void dfs(int i, int n, List<String> res, char[] cur) {
            if (i == n) {
                res.add(new String(cur));
            }
            cur[i] = '1';
            dfs(i + 1, n, res, cur);//选1
            if (i == 0 || cur[i - 1] == '1') {
                cur[i] = '0';//选0有条件
                dfs(i + 1, n, res, cur);
            }
        }
    }
}
