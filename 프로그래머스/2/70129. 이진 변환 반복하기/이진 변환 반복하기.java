import java.util.*;
class Solution {
    public int[] solution(String s) {
        int answer[] = new int[2];
        List<Integer> binaryCnts = new ArrayList<>();
        List<Integer> zeroCnts = new ArrayList<>();
        
        while(!s.equals("1")) {
            int zeroCnt = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    sb.append('1');
                } else {
                    zeroCnt++;
                }
            }
            zeroCnts.add(zeroCnt);
            s = Integer.toBinaryString(sb.length());
            binaryCnts.add(1);
        }
        answer[0] = binaryCnts.size();
        answer[1] = zeroCnts.stream().mapToInt(Integer::intValue).sum();
        return answer;
    }
}