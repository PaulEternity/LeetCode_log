public class Leet287 {
    class Solution {
        public int findDuplicate(int[] nums) {
           int targetMax = nums.length - 1;
           int targetMin = 0;
           while(targetMin != targetMax){
               int cur = (targetMax + targetMin)/2;
               int cnt = 0;
               for(int n : nums){
                   if(n <= cur){
                       cnt++;
                   }
               }
               if(cnt > cur){
                   targetMax = cur;
               }else{
                   targetMin = cur + 1;
               }
           }
           return targetMax;
        }
    }
}
