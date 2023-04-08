import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer =new int[score.length];
        double[] arr = new double [score.length];
        for(int i=0;i<arr.length;i++) {
            arr[i] = ((double)score[i][0]+score[i][1])/2;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++) {
            answer[i] = 1;
            for(int j=0;j<arr.length;j++) {
                if(arr[i] < arr[j]) answer[i] = answer[i]+1;
            }
        }
        return answer;
    }
}