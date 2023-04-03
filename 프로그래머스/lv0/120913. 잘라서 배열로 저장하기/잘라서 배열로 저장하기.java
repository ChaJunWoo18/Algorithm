import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        if(my_str.length()%n==0)
            answer = new String[my_str.length()/n];
        else
            answer = new String[my_str.length()/n+1];
        char[] arr = my_str.toCharArray();
        String str1 = "";
        int m = 0,i=0;
        for(int j=0;j<arr.length;j++) {
            str1 += arr[j];
            m++;
            if(n==m || j == arr.length-1) {
                answer[i] = str1;
                i++;
                m=0;
                str1="";
            }
        }
        return answer;
    }
}