import java.util.*;
import java.util.stream.Collectors;
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=arr[i-1])
                list.add(arr[i]);
        }
        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}