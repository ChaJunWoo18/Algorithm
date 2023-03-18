class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int idx = 0;
        int checker=0;
        int[] cnt = new int[1000];
        if(array.length==1)
            answer = array[0];
        else{
            for(int i:array) {
                cnt[i]++;
            }
            max = cnt[0];
            for(int i=1;i<cnt.length;i++){
                if(max<cnt[i]){
                    max = cnt[i];
                    answer = i;
                }
                else if (max == cnt[i]){
                    answer = -1;
                }
            }
        }
        return answer;
    }
}