import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> winLi = new ArrayList(Arrays.stream(win_nums).boxed().collect(Collectors.toList()));
        int correct = 0, zero = 0;
        for(int i=0;i<lottos.length;i++) {
            if(winLi.contains(lottos[i])) {
                correct++;
            }
            else if(lottos[i] == 0)
                zero++;
        }
        System.out.println(correct + ""+zero);
        int n=6;
        for(int i=1;i<=6;i++) {
            if(correct+zero == n--) {
                answer[0] = i;
                break;
            }
        }
        n=6;
        for(int i=1;i<=6;i++) {
            if(correct == n--) {
                answer[1] = i;
                break;
            }
        }
        for(int i=0;i<2;i++) 
            if(answer[i]==0)
                answer[i] = 6;
        return answer;
    }
}