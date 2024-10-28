import java.util.Stack;

public class Leet20 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for(char c : chars){
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                }
                else if(c == ')' || c == '}' || c == ']'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    else if(stack.peek() != '(' && c ==')'){
                        return false;
                    }else if(stack.peek() != '{' && c =='}'){
                        return false;
                    }else if(stack.peek() != '[' && c ==']'){
                        return false;
                    }else {
                        stack.pop();
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
