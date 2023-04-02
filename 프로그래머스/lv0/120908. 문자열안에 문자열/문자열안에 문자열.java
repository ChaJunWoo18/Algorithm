import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 1;
        String [] arr = str1.split(str2);
        String str = String.join("", arr);
        if(str.equals(str1)) 
            answer = 2;
        return answer;
    }
}