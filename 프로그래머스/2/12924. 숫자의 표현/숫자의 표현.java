public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int start = 1; start <= n / 2; start++) {
            int sum = 0;
            int end = start;
            while (sum < n) {
                sum += end;
                end++;
            }
            if (sum == n) {
                answer++;
            }
        }
        
        return answer+1;
    }
}
