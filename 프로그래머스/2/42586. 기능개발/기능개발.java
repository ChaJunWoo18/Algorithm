import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<progresses.length;i++) {
            int a = 0;
            if((100-progresses[i])%speeds[i]!=0)
                a = 1;
            q.add((100-progresses[i])/speeds[i] + a);
        }
        while(q.size()!=0) {
            int pre = q.poll();
            int cnt = 1; // 배포횟수
            while(q.size()!=0 && pre>=q.peek()) {
                q.poll();
                cnt++;
            }    
            
            list.add(cnt);
        }
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++) 
            answer[i] = list.get(i);
        return answer;
    }
}