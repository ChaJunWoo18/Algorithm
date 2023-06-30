import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = Arrays.asList(Arrays.stream(score)
                                                  .boxed().toArray(Integer[]::new));
        Collections.sort(list, Collections.reverseOrder());
        int j=m-1;
        for(int i=0;i<list.size()/m;i++) {
            answer += list.get(j) * m;
            j+=m;
        }
        return answer;
    }
}