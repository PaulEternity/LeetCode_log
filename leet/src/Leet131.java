import java.util.ArrayList;
import java.util.List;

public class Leet131 {
    class Solution {
        private String s;
        List<String> list =  new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        public List<List<String>> partition(String s) {
            this.s = s;
            backtrack(0);
            return res;
        }
        private void backtrack(int i){
            if(i == s.length()){
                res.add(new ArrayList<>(list));
                return;
            }
            for(int j = i; j < s.length();j++){
                if(judge(i,j)){
                    list.add(s.substring(i,j+1));
                    backtrack(j+1); //不是回文就没必要继续回溯
                    list.remove(list.size()-1);
                }
            }

        }
        private boolean judge(int left,int right) {
            while (left < right) {
                if(s.charAt(left++) != s.charAt(right--)) {
                    return false;
                }
            }
            return true;
        }
    }
}
