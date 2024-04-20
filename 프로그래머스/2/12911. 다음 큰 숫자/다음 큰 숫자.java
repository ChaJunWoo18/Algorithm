import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = n+1;
        int bitCntN = bitCnt(n);
        while(true) {
            if(bitCntN == bitCnt(answer))
                break;
            else
                answer++;
        }
        return answer;
    }
    public int bitCnt(int a) {
        int cnt = 0;
        while(a!=0) {
            cnt += a & 1;
            a >>= 1;
        }
        return cnt;
    }
}