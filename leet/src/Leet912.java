import java.util.concurrent.ThreadLocalRandom;

public class Leet912 {
    class Solution {
        public int[] sortArray(int[] nums) {
            quickSort(nums, 0, nums.length - 1);
            return nums;
        }

        void quickSort(int[] nums, int low, int high) {
            if (low >= high) {
                return;
            }
            int p = partition(nums, low, high);//分区，返回基准位置
            //对左右子树进行递归排序
            quickSort(nums, low, p - 1);
            quickSort(nums, p + 1, high);
        }

        int partition(int[] nums, int low, int high) {
            int index = ThreadLocalRandom.current().nextInt(high - low + 1) + low;//随机选一个数作为基准值
            swap(nums, low, index);
            int pivot = nums[low];
            int i = low + 1;
            int j = high;
            while (i <= j) {
                while (i <= j && nums[i] < pivot) {//从左向右找第一个大于等于pivot的
                    i++;
                }
                while (i <= j && nums[j] > pivot) {//从右向左找第一个小于等于pivot的
                    j--;
                }
                if (i <= j) {//找到这样的两个元素就交换位置，就会变成升序，最终重合的位置就是pivot的位置
                    swap(nums, i, j);
                    i++;
                    j--;
                }
            }
            swap(nums,j, low);//把基准值放回最终位置
            return j;
        }

        void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

/**
 * 降序
 */
class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
    void quickSort(int[] nums,int low,int high){
        if(low >= high){
            return;
        }
        int p = partition(nums,low,high);
        quickSort(nums,low,p-1);
        quickSort(nums,p+1,high);
    }
    int partition(int[] nums,int low,int high){
        int index = ThreadLocalRandom.current().nextInt(high - low + 1) + low;
        swap(nums,index,low);
        int pivot = nums[low];
        int i = low+1;
        int j = high;
        while(i <= j){
            while(i <= j && nums[i] > pivot){
                i++;
            }
            while(i<=j && nums[j] < pivot){
                j--;
            }
            if(i <= j){
                swap(nums,i,j);
                i++;
                j--;
            }
        }
        swap(nums,low,j);
        return j;
    }
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}