import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> bef = new ArrayList<>();
        Arrays.fill(answer, -1);
        bef.add(list.get(0)); //첫번째 값 넣기
        int n = 1;   
        for(int i=1;i<list.size();i++) {
            n=1;
            if(bef.contains(list.get(i)))
                for(int j=i-1;j>=0;j--) {
                    if(list.get(j).equals(list.get(i))){
                        answer[i] = n;
                        break;
                    }
                    n++;
                }
            bef.add(list.get(i));
        }
        return answer;
    }
}