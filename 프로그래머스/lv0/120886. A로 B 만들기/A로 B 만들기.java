class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] arr = before.split("");
        for(String s:arr) {
            after = after.replaceFirst(s,"");    
        }
        if(after.equals("")) return 1;
        return answer;
    }
}