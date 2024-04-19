class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        
       for(char c : s.toCharArray()) {
           if(c==' ') {
               sb.append(' ');
               isFirst = true;
           }
           else{
               if(isFirst) {
                   sb.append(Character.toUpperCase(c));
                   isFirst = false;
               } else {
                   sb.append(c);
               }
           }
        }
        return sb.toString();
      
    }
}