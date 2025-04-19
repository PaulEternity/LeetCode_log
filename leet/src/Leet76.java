public class Leet76 {
    class Solution {
        public String minWindow(String s, String t) {
            char[] strS = s.toCharArray();
            char[] strT = t.toCharArray();
            int[] cntT = new int[128];
            int[] cntS = new int[128];
            for(char c : strT){
                cntT[c]++;
            }
            int left = 0;
            int ansLeft = -1;
            int ansRight = strS.length;
            for(int right = 0;right<strS.length;right++){
                cntS[strS[right]]++;
                while(isCovered(cntT,cntS)){
                    if(right-left < ansRight-ansLeft){
                        ansLeft = left;
                        ansRight = right;
                    }
                }
                cntS[strS[left]]--;
                left++;
            }
            return ansLeft < 0 ? "0" : s.substring(ansLeft,ansRight+1);
        }
        private boolean isCovered(int[] cntT,int[] cntS){
            for(int i='A';i<'Z';i++){
                if(cntS[i] < cntT[i] ){
                    return false;
                }
            }
            for(int i='a';i<'z';i++){
                if(cntS[i]<cntT[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
