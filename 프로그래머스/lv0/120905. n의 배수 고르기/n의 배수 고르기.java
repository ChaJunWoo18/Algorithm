import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int a = 0;
        String tmp="";
        String[] arr = {};
        for(int i=0;i<numlist.length;i++) {
            if(numlist[i] % n == 0) {
                a++;
                if(i==numlist.length-1)
                    tmp += numlist[i];
                else
                    tmp += numlist[i]+",";
            } 
        }
        answer = new int[a];
        arr = tmp.split(",");
        for(int i=0;i<a;i++) 
            answer[i] = Integer.parseInt(arr[i]);
        return answer;
    }
}