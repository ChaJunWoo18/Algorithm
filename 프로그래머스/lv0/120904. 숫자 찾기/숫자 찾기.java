import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String [] arr = Integer.toString(num).split("");
        String a = Integer.toString(k);
        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals(a)) {
                answer = i+1;
                break;
            }
        }
        if(answer ==0)
            answer = -1;
        return answer;
    }
}