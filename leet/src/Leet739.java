import java.util.Deque;
import java.util.LinkedList;

public class Leet739 {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int [] res = new int[temperatures.length];
            Deque<Integer> stack = new LinkedList<>();//注意这个初始化方法
            for(int i = 0; i < temperatures.length; i++){
                int temperature = temperatures[i];
                //存下标，完了栈没空就说明还有没赋值的
                //这么快如果温度类似递增基本就是从后往前赋值，通过下标计算
                while(!stack.isEmpty()&&temperature > temperatures[stack.peek()]){
                    int prevIndex = stack.pop();
                    res[prevIndex] = i - prevIndex;
                }
                stack.push(i);
            }
            return res;
        }
    }
}
