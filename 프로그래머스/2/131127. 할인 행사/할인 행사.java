import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        boolean success = true;
        for(int i=0;i<10;i++) {
            map.put(discount[i], map.getOrDefault(discount[i],0)+1);
        }
        for (int i = 0; i < want.length; i++) {
            if (map.getOrDefault(want[i], 0) < number[i]) {
                success = false;
                break;
            }
        }
        if (success) 
            answer++;
        
        for(int j=10;j<discount.length;j++) {
            success = true;
            map.put(discount[j-10], map.get(discount[j-10])-1);
            map.put(discount[j], map.getOrDefault(discount[j],0)+1);
            for(int i=0;i<want.length;i++){
                if(map.getOrDefault(want[i],0)<number[i]) {
                    success = false;
                    break;
                }   
            }
            if(success)
                answer++;    
        }
        return answer;
    }
}
