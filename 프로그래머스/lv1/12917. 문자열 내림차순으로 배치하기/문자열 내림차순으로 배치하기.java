import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        answer = Arrays.stream(arr).collect(Collectors.joining());
        return answer;
    }
}