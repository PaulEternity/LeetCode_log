import java.util.ArrayList;
import java.util.List;

public class Leet22 {
    class Solution {
        private int n;
        private char[] path;
        private final List<String> list = new ArrayList<>();

        public List<String> generateParenthesis(int n) {
            this.n = n;
            path = new char[n * 2];
            backtrack(0, 0);
            return list;
        }

        //i:目前填了的括号个数
        //open：左括号个数，i-open：右括号个数
        private void backtrack(int i, int open) {
            if (i == n * 2){
                list.add(new String(path));
                return;
            }
            if(open < n){
                path[i] = '(';
                backtrack(i + 1, open + 1);
            }
            if(i - open < open){
                path[i] = ')';
                backtrack(i + 1, open);
            }
        }
    }

}
