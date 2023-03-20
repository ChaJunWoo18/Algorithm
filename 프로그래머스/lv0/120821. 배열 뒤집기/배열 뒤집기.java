class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n];
        int i =0;
        while (n>0) {
            answer[i]=num_list[n-1];
            i++;
            n-= 1;
        }
        return answer;
    }
}