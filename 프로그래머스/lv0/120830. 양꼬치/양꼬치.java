class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int a = 12000*n;
        int b = 2000 * k- (n/10 * 2000);
        answer = a + b;
        return answer;
    }
}