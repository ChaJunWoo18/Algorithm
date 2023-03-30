import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
 
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<Character>();
        ArrayList<Character> list2 = new ArrayList<Character>();
        char[] charArr = s.toCharArray();
        for(char c : charArr) {
            if(!list.contains(c))
                list.add(c);
            else if(list.contains(c) && !list2.contains(c)) {
                list2.add(c);
            }
        } 
        int i=0;
        Collections.sort(list);
        for(char c: list) {
            if(!list2.contains(c)) {
                answer+=list.get(i);
            }
            i++;
        }
        System.out.print(list2);
        return answer;
    }
}