import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        boolean flag = true;
        int[] arr = new int[200];
        for(int i=0;i<3;i++) {
            int a = lines[i][0]+100;   
            while(flag) {
                System.out.println(a);
                arr[a++]+=1;
                if(a==lines[i][1]+100)
                    flag=false;
            }
            System.out.println(i+"번째 끝");
            flag = true;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=2) answer++;
        }
        return answer;
    }
}