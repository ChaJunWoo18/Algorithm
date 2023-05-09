class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        System.out.println(s.length());
        if(s.length()!=4 && s.length()!=6)
            return false;
        char[] arr = s.toCharArray();
        for(char c:arr)
            if(!Character.isDigit(c))
                return false;
        return answer;
    }
}