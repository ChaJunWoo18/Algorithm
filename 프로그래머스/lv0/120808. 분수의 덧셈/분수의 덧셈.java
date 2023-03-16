import java.util.*;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0,0};
        int 분모 = denom1 * denom2 / gcd(denom1,denom2);
        int 분자 = (분모 / denom1 * numer1) + (분모 / denom2 * numer2);
        
        if(분자 % gcd(분모,분자)==0 && 분모 % gcd(분모,분자)==0) {
            answer[0] = 분자 / gcd(분모,분자);
            answer[1] = 분모 / gcd(분모,분자);
            return answer;
        }
        answer[0] = 분자;
        answer[1] = 분모;
        return answer;
    }
    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}