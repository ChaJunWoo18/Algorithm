class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        for(String i:arr) {
            for(int j=0;j<i.length();j++) {
                if(j%2==0)
                    answer += i.substring(j,j+1).toUpperCase();
                else if(j%2==1)
                    answer +=i.substring(j,j+1).toLowerCase();
            }
            if(answer.length()!=s.length())
                answer += " ";
        }
        return answer;
    }
}