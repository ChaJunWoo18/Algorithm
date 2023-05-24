import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<food.length;i++) {
            cnt = food[i] / 2;
            for(int j=0;j<cnt;j++) {
                list.add(i);
            }
        }
        for(int i:list) 
            answer += i;
        answer += "0";
        for(int i=list.size()-1;i>=0;i--) 
            answer += list.get(i);
        return answer;
    }
}