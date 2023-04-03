import java.util.*;
import java.util.stream.Collectors;;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>(); 
        if(score.length < k) 
            k=score.length;
        for(int i=0;i<k;i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            answer[i] = list.get(list.size()-1);
        }
        for(int i=k;i<score.length;i++) {
            for(int j=0;j<k;j++) {
                if(list.get(j)<score[i]) {
                    list.add(score[i]);
                    list.remove(list.size()-2);
                    break;
                }
            }     
            Collections.sort(list, Collections.reverseOrder());
            answer[i] = list.get(list.size()-1);
        }   
        return answer;
    }
}