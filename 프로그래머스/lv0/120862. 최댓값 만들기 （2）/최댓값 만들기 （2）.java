import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i:numbers) {
            arrList.add(i);
        }
        Collections.sort(arrList);
        answer = arrList.get(0) * arrList.get(1);
        int a = arrList.size();
        int tmp = arrList.get(a-1) * arrList.get(a-2);
        if(answer < tmp)
             answer = tmp;
        
        return answer;
    }
}