public class Leet125 {
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuffer sb = new StringBuffer();
            char[] chars = s.toCharArray();
            int n = chars.length;
            for(int i = 0;i<n;i++){
                if(Character.isLetterOrDigit(chars[i])){
                    sb.append(Character.toLowerCase(chars[i]));
                }
            }
            StringBuffer rev = new StringBuffer(sb).reverse();
            return rev.toString().equals(sb.toString());
        }
    }
}
