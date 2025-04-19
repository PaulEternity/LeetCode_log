import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Leet380 {
    class RandomizedSet {
        int[] nums = new int[200010];
        Random rand = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        int index = -1;

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            nums[++index] = val;
            map.put(val, index);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            //获取并移除该值的索引
            int loc = map.remove(val);
            //判断是否是数组中最后一个元素
            if (loc != index) {
                //不是，用最后一个元素填补当前被删除的
                map.put(nums[index], loc);
            }
            //是最后一个元素，回退一格
            nums[loc] = nums[index--];
            return true;
        }

        public int getRandom() {
            //0到index内的随机整数
            return nums[rand.nextInt(index + 1)];
        }
    }
}
