class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0, y=0;
        for(int i=0;i<s.length();i++) {
            String a = s.substring(i,i+1);
            if(a.equals("p") || a.equals("P")) p++;
            else if(a.equals("y") || a.equals("Y")) y++;
        }
        if(p!=y) answer = false;
        return answer;
    }
}