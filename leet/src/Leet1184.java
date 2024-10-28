public class Leet1184 {
    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            if(start > destination){
                int temp = start;
                start = destination;
                destination = temp;
            }
            int d1 = 0;
            int d2 = 0;
            for(int i = 0; i < distance.length; i++){
                if(start<=i &&i < destination){
                    d1 += distance[i];
                }else {
                d2 += distance[i];
            }
        }
            return Math.min(d1, d2);

        }
    }
}
