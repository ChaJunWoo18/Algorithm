import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> list = (ArrayList<Integer>)Arrays.stream(numbers)
            .boxed().collect(Collectors.toList()); //int 배열 to arraylist
        for(int i=0;i<10;i++) {
            if(!list.contains(i))
                answer += i;
        }
        return answer;
    }
}