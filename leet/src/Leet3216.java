public class Leet3216 {
    class Solution {
        public String getSmallestString(String s) {
            char[] chars = s.toCharArray();
            for(int i = 1; i < chars.length; i++){
                char pre = chars[i-1];
                char cur = chars[i];
                if(pre > cur && pre % 2 == cur % 2 ){
                    chars[i] = pre;
                    chars[i-1] = cur;
                    break;
                }
            }
            return new String(chars);
        }
    }
}
