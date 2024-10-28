import java.util.ArrayList;
import java.util.List;

public class Leet17 {
    class Solution {
        private static final String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        private List<String> ans = new ArrayList<>();
        private char[] digits;
        private char[] tmp;

        public List<String> letterCombinations(String digits) {
            int n = digits.length();
            if (n == 0) return List.of();
            this.digits = digits.toCharArray();
            tmp = new char[n];
            backtrack(0);
            return ans;


        }

        private void backtrack(int i) {
            if (i == digits.length) {
                ans.add(new String(tmp));
                return;
            }

            for (char c : MAPPING[digits[i] - '0'].toCharArray()) {
                tmp[i] = c; //不能和下面那行调换
                backtrack(i + 1);
            }

        }
    }

}
