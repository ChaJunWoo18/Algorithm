import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 2;
        double a = Math.sqrt(n);
        String str = a+"";
        str = str.replace(".","-");
        String[] arr = str.split("-");
        if(arr[1].equals("0"))
            answer =1;
        return answer;
    }
}