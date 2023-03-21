import java.util.Arrays;
class Solution {
    public String solution(String my_string, String letter) { 
        String answer = "";
        answer = my_string.replaceAll(letter,"");
        System.out.println(letter);
        return answer;
        
    }
}