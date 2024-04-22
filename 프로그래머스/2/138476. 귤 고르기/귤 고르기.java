import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i : tangerine) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()) {
            pq.add(map.get(key));
        }
        while(k>0) {
            k-=pq.poll();
            answer++;
        }
        return answer;
    }
}
