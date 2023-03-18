class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int tmp = slice;
        while (slice>0) {
            if (slice >= n) {
                answer = slice / tmp;
                break;
            }
            else
                slice += tmp;
        }
        return answer;
    }
}