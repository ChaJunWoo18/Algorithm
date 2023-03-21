class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int w = 0;
        int g= 0;
        for(int i=0;i<num_list.length;i++) {
            if(num_list[i]%2 ==0) 
                w+=1;
            else
                g+=1;
        }
        answer[0] = w;
        answer[1] = g;
        return answer;
    }
}