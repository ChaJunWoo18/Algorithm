class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(char c:arr) {   //아스키 코드 대문자 A~Z: 65~90 , 소문자 a~z: 97~122
            System.out.println(c+0);
            if(c==' ') 
                answer+= c;
            else if(c+0>=65 && c+0<=90 && c+n>90)
                answer += Character.toString(65+c+n-91);
            else if(c+0>=97 && c+0<=122 && c+n>122)
                answer += Character.toString(97+c+n-123);
            else
                answer += Character.toString(c+n);
            
        }
        return answer;
    }
}