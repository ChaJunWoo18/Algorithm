import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int idx = 1;
        int n = emergency.length;
        while(n>0) {
            int max= 0;
            for(int i=0;i<emergency.length;i++) {
                if(max < emergency[i]) {
                    max = emergency[i];
                }
            }
            for(int i=0;i<emergency.length;i++) {
                if(max==emergency[i]) {
                    answer[i] = idx;
                    emergency[i] = 0;
                    idx++;
                }
            }
            n--;
        }
        return answer;
    }
}