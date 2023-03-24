class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i=0;
        for(int j=0;j<k-1;j++){
            if(i==numbers.length-2)
                i=0;
            else if(i==numbers.length-1)
                i=1;
            else
                i+=2;
        }
        answer=numbers[i];
        return answer;
    }
}