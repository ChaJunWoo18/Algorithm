class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int[] answer_n = new int[numbers.length];
        int i=0;
        int j=0;
        if(direction.equals("right")){
            for(i=0;i<numbers.length;i++){
                if(i==numbers.length-1){
                    answer_n[0]=numbers[i];
                }
                else{
                    answer_n[i+1]=numbers[i];
                }
            } 
        }
        else if(direction.equals("left")){
            for(i=1;i<numbers.length;i++){
                answer_n[i-1]=numbers[i];
                answer_n[numbers.length-1]=numbers[0];
            } 
        }
        answer=answer_n;
        return answer;
    }
}