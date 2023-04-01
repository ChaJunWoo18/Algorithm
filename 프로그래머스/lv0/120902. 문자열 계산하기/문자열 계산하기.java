import java.util.*;
class Solution {
    public int solution(String s) {
        String [] arr = s.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for(int i=1;i<arr.length;i+=2) {
            if(arr[i].equals("+"))
                answer += Integer.parseInt(arr[i+1]);
            else 
                answer -= Integer.parseInt(arr[i+1]);
        }
        return answer;
    }
}