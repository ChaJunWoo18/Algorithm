class Solution {
    public int solution(int[] sides) {
        int answer = 0, max =0, min=0, x=1;
        if(sides[0]>sides[1]) {
            max = sides[0];
            min = sides[1];
        }
        else {
            max = sides[1];
            min = sides[0];
        }
        for(int i=1;i<=max;i++) {
            if(min+i>max) {
                answer++;
                x=i;
            }
        }
        for(x=x+1;x<max+min;x++) {
            answer++;
        }
        return answer;
    }
}