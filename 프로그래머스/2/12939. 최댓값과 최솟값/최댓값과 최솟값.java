import java.util.*;
class Solution {
    public String solution(String s) {
        String[] splitS = s.split(" ");
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int a = 0;
        for(String i:splitS){
            a = Integer.parseInt(i);
            if(max<a) {
                max = a;
            }
            if(min>a)
                min = a;
        }
        return min+" "+max;
    }
}