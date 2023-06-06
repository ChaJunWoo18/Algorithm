class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int j=0;
        for(int i=1;i<section.length;i++) {
            if(section[j]-1+m>=section[i]) {
                continue;   
            }
            else {
                j=i;
                answer++;
            }
        }
        answer++;
        return answer;
    }
}