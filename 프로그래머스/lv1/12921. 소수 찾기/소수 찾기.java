import java.util.*;
class Solution {
    public int solution(int n) {
        //Math.sqrt(i) 개 미만의 소수까지만 사용해서 나누어 떨어지지 않으면 소수이다. (에라토스테네스의 체)
        int answer = 0;
        boolean[] check = new boolean[n+1];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        for(int i=2;i<=(int)Math.sqrt(n);i++) {
            if(check[i] == true) {
                for(int j=i*i;j<=n;j+=i) 
                    check[j] = false;
            }
        }
        for(int i=2;i<=n;i++) {
            if(check[i]) answer++;
        }
        return answer; 
    }
}