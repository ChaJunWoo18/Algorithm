class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = x,  b = x;
        for(int i=0;i<n;i++) { 
            answer[i] = b;
            b+=a;
        }
        return answer;
    }
}