import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArray = s.split(" ");
        String[] tmpArray = {"0"};
        for(String str : strArray) {
            if(str.equals("Z")) {
                answer -=Integer.valueOf(tmpArray[0]);
            }
            else {
                answer += Integer.valueOf(str);
                tmpArray[0] = str;
            }
                
                
        }
        return answer;
    }
}