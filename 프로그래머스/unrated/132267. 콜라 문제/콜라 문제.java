class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a) {
            answer += n / a * b; //받은개수
            n = n / a * b + (n % a);
        }
        return answer;
    }
}