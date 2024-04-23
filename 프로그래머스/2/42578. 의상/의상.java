import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesMap = new HashMap<>();
        
        //종류별 개수
        for(String[] item:clothes) {
            String type = item[1];
            clothesMap.put(type, clothesMap.getOrDefault(type,0)+1);
        }    
        for(int cnt:clothesMap.values()) {
            answer *= (cnt+1);
        }
        return answer-1;
    }
}