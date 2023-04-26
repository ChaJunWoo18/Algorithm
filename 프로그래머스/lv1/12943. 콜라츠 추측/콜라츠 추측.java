class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        if(num == 1) return 0;
        for(int i=1;i<=500;i++) {
            n = (long)(n%2==0?n/2:n*3+1);
            if(n ==1) return i;
        }
        if(n != 1) answer = -1;
        return answer;
    }
}