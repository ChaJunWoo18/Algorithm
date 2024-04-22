import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int minus = (int)(right-left);
        int[] answer = new int[minus+1];
        int idx= 0;
        for(long i=left;i<=right;i++) {
            answer[idx++] = (int)Math.max(i/n, i%n)+1;
        }
        //1 2 3 /2 2 3/ 3 3 3
        //1234/2234/3334/4444
        return answer;
    }
}