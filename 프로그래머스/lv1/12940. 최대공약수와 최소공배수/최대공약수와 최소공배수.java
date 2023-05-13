class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {0,0};
        int a = gcd(n,m);
        answer[0] = a;
        answer[1] = n * m / a;
        return answer;
    }
    
    int gcd(int a, int b)
    {
        return b >0? gcd(b, a%b) : a;
    }
}