import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                sum = numbers[i] + numbers[j];
                if(!list.contains(sum))
                    list.add(sum);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++)
            answer[i] = list.get(i);
        return answer;
    }
}