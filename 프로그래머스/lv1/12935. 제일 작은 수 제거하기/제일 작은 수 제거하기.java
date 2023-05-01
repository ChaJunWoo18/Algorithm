import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length==1?1:arr.length-1, min = arr[0],idx=0;
        answer = new int[len];
        for(int i=1;i<arr.length;i++) {
            if(min > arr[i])
                min = arr[i];
        }//최솟값 찾기
        for(int i=0;i<arr.length;i++) {
            if(min!=arr[i]) {
                answer[idx] = arr[i];
                idx++;
            }
        }        
        if(answer.length==1) answer[0] = -1;
        return answer;
    }
}