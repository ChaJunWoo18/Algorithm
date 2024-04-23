import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        //LRU : 사용한지 가장 오래된 것부터 캐시에서 제거  , Cash hit : 캐시에 입력 값이 존재, miss : 입력 값이 존재하지 않음
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(cacheSize, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String,Integer> eldest) {
                return size() > cacheSize;
            }
        };
        for(int i=0;i<cities.length;i++) {
            if(cache.isEmpty() || !cache.containsKey(cities[i].toLowerCase()))
                answer+=4;
            answer++;
            cache.put(cities[i].toLowerCase(),1);
        }
        return answer;
    }
    
}
