class Solution {
    public int solution(int n) {
        int answer = 0;
        int mul=1;
        for(int j=1;j<=10;j++){
            mul=mul*j;
            if(mul>n){
                if(j>=10)
                    answer=10;
                else {
                    answer=j-1;
                    return answer;
                }
            }
            else{
                answer = j;
            }
        }
     return answer;
    }
}