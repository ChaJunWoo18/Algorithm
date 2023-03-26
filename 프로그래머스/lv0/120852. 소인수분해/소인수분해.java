import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int i = 2;
        int cnt = 0;
        String str = "";
        List<Integer> obj = new ArrayList<>();
        while(i<=n) {
            if(n%i==0) {
                n/=i;
                obj.add(i);
                cnt++;
            }
            else
                i++;
        }//여기까지 하면 str에 소인수분해 값이 들어감. ex) 12면 223 , 420이면 22357
        if (cnt==1)
            answer = new int[]{obj.get(0)};
        else{
            List<Integer> newList = obj.stream().distinct().collect(Collectors.toList());//중복값 제거
            answer = newList.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}