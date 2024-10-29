public class Leet274 {
    class Solution {
        public int hIndex(int[] citations) {
            int n = citations.length;
            int[] cnt = new int[n+1];
            //统计调用次数,即每种次数下有多少文章被调用，大于n的按n算，这样不越界
            for(int cur : citations){
                cnt[Math.min(cur,n)]++;
            }
            int s = 0;
            for(int i = n; i >= 0;i--){
                s += cnt[i];//添加对应次数
                if(s >= i){//到有一次大于当前值了，就找到了临界H指数
                    return i;
                }
            }
            return 0;
        }
    }
}
