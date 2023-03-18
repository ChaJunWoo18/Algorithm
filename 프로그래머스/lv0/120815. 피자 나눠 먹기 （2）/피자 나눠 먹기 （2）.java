class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 6;
        while (i>0){
            if (i % n == 0) {
                answer = i / 6;
                break;
            }
            else
                i += 6;
        }
        return answer;
    }
}