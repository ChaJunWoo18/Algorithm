import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++) {
            if(citations[i]>=citations.length-i) {
                answer= citations.length-i;
                break;
            }
        }//0 1 3 5 6   4 8
        return answer;
    }
}