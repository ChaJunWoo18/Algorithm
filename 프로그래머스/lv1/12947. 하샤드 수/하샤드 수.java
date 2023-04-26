import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int len = Integer.toString(x).length();
        int tmp = x;
        //각 자릿수 값 구하기
        for(int i=0;i<len;i++) {
            arr.add(x%10);
            x /= 10;
        }
        int sum = 0;
        for(int i:arr) sum += i;
        if(tmp % sum !=0) answer = false;
        return answer;
    }
}