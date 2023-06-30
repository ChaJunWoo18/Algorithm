import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] su1 = {1, 2, 3, 4, 5};
        int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        int max = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == su1[i % su1.length]) cnt[0]++;
            if (answers[i] == su2[i % su2.length]) cnt[1]++;
            if (answers[i] == su3[i % su3.length]) cnt[2]++;
        }

        max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        ArrayList<Integer> list = new ArrayList<>();

        if (max == cnt[0]) list.add(1);
        if (max == cnt[1]) list.add(2);
        if (max == cnt[2]) list.add(3);

        answer = new int[list.size()];

        for (int i=0;i<answer.length;i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
