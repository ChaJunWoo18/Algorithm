class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int idx=0;
        int mid = total / num; //중앙값
        if(total%num == 0) //num이 홀수
            idx = num / 2; //중앙인덱스
        else //짝수
            idx = num / 2 -1;
        for(int i=0;i<num;i++) 
            answer[i] = mid - (idx - i);
        
        return answer;
    }
}