import java.util.ArrayList;
import java.util.List;

public class Leet88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            List<Integer> list = new ArrayList<>();
            int forNum1 = 0;
            int forNum2 = 0;
            while(forNum1 < m && forNum2 < n){
                if (nums1[forNum1] < nums2[forNum2]) {
                    list.add(nums1[forNum1]);
                    forNum1++;
                } else {
                    list.add(nums2[forNum2]);
                    forNum2++;
                }
            }
            //把剩下的元素加进去
            while(forNum1 < m){
                list.add(nums1[forNum1]);
                forNum1++;
            }
            while(forNum2 < n){
                list.add(nums2[forNum2]);
                forNum2++;
            }
            for(int i = 0; i < list.size();i++){
                nums1[i] = list.get(i);
            }

        }
    }
}
