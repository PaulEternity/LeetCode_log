
public class Leet42 {
    class Solution {
        public int trap(int[] height) {
            int mx = getMax(height);
            int res = 0;
            for (int i = 0; i < mx; i++) { //有多少行
                int temp = 0;
                boolean isBegin = false;
                for (int j = 0; j < height.length; j++) { //数组多少列
                    if(height[j] < i && isBegin){
                        temp ++;
                    }
                    if(height[j] >= i){
                        isBegin = true;
                        res += temp;
                        temp = 0;
                    }
                }
            }
            return res;
        }
        public int getMax(int[] height) {
            int max = 0;
            for (int j : height) {
                if (j > max) {
                    max = j;
                }
            }
            return max;
        }
    }


}
