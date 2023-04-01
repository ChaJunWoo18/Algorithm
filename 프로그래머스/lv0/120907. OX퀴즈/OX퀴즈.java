import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] arr ={};
        int sum=0, res = 0;
        for(int i=0;i<quiz.length;i++) {
            arr = quiz[i].split(" ");
            res = Integer.parseInt(arr[4]);
            System.out.println(Arrays.toString(arr));
            if(arr[1].equals("+")) {
                sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                if(res==sum)
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
            else {
                sum = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                if(res==sum)
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }   
        }
        return answer;
    }
}