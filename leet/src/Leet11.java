import static java.lang.Math.max;
import static java.lang.Math.min;

public class Leet11 {
    class Solution {
        public int maxArea(int[] height) {
            int j = height.length - 1;
            int maxVol = 0;
            int i = 0;
            while (i < j) {
                int currentVol = min(height[i], height[j])*(j - i);
//                int currentVol = max(min(height[i],height[j-1])*(j-1-i),min(height[i], height[j])*(j - i));
                maxVol = max(maxVol, currentVol);
                if (height[i] < height[j]) {
                    i++;
                }else {
                    j--;
                }

            }
            return maxVol;
        }
    }
}
