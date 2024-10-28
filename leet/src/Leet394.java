import java.util.LinkedList;

public class Leet394 {
    class Solution {
        public String decodeString(String s) {
            StringBuilder res = new StringBuilder();
            int multi = 0;
            LinkedList<Integer> stack_multi = new LinkedList<>();
            LinkedList<String> stack_res = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (c == '[') {
                    stack_multi.push(multi);//把对应倍数压入栈
                    stack_res.addLast(res.toString());//把对应字符压入栈
                    multi = 0;//重置倍数，便于下次记录
                    res = new StringBuilder();//重置res，便于下次记录
                } else if (c == ']') {
                    StringBuilder tmp = new StringBuilder();
                    //LinkedList是双向链表实现的，这里是把最晚的倍数拿出来
                    int cur_multi = stack_multi.removeLast();
                    for (int i = 0; i < cur_multi; i++) {
                        tmp.append(res);
                    }
                    //每次统计完更新，记录的是当前的串，它就是最终答案
                    res = new StringBuilder(stack_res.removeLast() + tmp);
                } else if (c >= '0' && c <= '9') {
                    //这种存法可以防止两位数只记录了一位的情况导致倍数错误
                    multi = multi * 10 + Integer.parseInt(c + "");
                } else {
                    res.append(c);
                }
            }
            return res.toString();
        }
    }
}
