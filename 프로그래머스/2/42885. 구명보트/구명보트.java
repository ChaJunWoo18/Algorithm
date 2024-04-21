import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : people) {
            list.add(i);
        }

        while (!list.isEmpty()) {
            int lastIdx = list.size() - 1;
            if (lastIdx == 0) {
                return answer+1;
            } else {
                if (limit - list.get(lastIdx) >= list.get(0)) {
                    list.remove(0);
                    list.remove(lastIdx-1);
                }
                else {
                    list.remove(lastIdx);
                }
                
            }
            answer++;
        }
        return answer;
    }
}
