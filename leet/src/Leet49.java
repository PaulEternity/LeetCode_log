import java.util.*;


public class Leet49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                map.computeIfAbsent(new String(chars),k -> new ArrayList<>()).add(str);

            }
            return new ArrayList<>(map.values());

        }
    }
}
