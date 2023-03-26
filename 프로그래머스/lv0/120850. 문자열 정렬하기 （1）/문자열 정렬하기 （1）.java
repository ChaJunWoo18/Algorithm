import java.util.Arrays;
import java.util.stream.Stream;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String tmp = "";
        char[] arr = my_string.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if(Character.isDigit(arr[i])) {
                tmp+= arr[i];
            }
        }
        answer = new int[tmp.length()];
        answer =  Stream.of(tmp.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(answer);
        return answer;
    }
}