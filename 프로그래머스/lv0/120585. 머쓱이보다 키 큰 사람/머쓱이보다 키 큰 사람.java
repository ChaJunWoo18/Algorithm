class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i:array) {
            if(height<i)
                answer++;
        }
        return answer;
    }
}