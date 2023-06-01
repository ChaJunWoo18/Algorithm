import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
            put(0,"FRI"); put(1,"SAT"); put(2,"SUN"); put(3,"MON");
            put(4, "TUE"); put(5, "WED"); put(6, "THU");
        }};
        int sumD = 0;
        for(int i=0;i<a-1;i++) {
            sumD += days[i];
        }
        sumD += b-1;
        for(Integer i : map.keySet()){ //저장된 key값 확인
            if(sumD % 7 == i)
                answer = map.get(i);
        }
        return answer;
    }
}