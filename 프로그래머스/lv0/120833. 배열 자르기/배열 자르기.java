import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int j = 0;
        boolean checker = false;
        for(int i=0;i<numbers.length;i++) {
            if(i ==num1 || checker==true) {
                answer[j] = numbers[i];
                checker = true;
                j++;
                if(i+1 == num2) {
                    answer[j]= numbers[i+1];
                    break;
                }
            }
        }
        return answer;
    }
}