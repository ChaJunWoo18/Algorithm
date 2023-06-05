class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int sum = 0;
        for(int j=1;j<=number;j++) {
            if(j!=1)
                sum = 0;
            for(int i=1;i<=(int)Math.sqrt(j);i++) {
                if (j % i == 0) {
                    sum++;
                    if (i * i < j) {
                        sum++;
                    }
                }
            }
            answer +=sum > limit ? power : sum;
        }
        return answer;
    }
}