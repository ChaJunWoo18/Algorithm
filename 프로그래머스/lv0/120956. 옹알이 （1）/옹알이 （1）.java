import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0, idx=0;
        String[] t = {"aya", "ye", "woo", "ma"};
        for(int i=0;i<babbling.length;i++) {
            for(int j=0;j<4;j++) {
                if(babbling[i].contains(t[j])) {
                    babbling[i] = babbling[i].replace(t[j],"-");
                }
            }
            System.out.println(i+"번째는?"+babbling[i]);
            babbling[i] = babbling[i].replaceAll("-","");
            if(babbling[i].equals("")) answer++;
        }
        return answer;
    }
}