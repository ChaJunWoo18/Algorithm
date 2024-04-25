import java.util.*;

class Solution {
    static class Pair {
        int priority;
        int location;

        public Pair(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
   
        Queue<Pair> q = new LinkedList<>();
        
        for(int i=0;i<priorities.length;i++) 
            q.add(new Pair(priorities[i],i));
        while (!q.isEmpty()) {
            Pair poll = q.poll();
            boolean hasHigherPriority = false;
            for(Pair p:q) {
                if(p.priority > poll.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }
            if(hasHigherPriority) {
                q.add(poll);
            } else {
                answer++;
                if(poll.location==location)
                    break;
            }
        }
        return answer;
    }
}
