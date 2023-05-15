import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0) {
            list.add(n % 3);
            n /= 3;
        }
        System.out.println(list);
        for(int i=0;i<list.size();i++) {
            s+= list.get(i);
        }
        answer = Integer.parseInt(s,3);
        return answer;
    }
}