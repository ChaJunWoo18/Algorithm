import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();
        for (String phoneNumber : phone_book) {
            map.put(phoneNumber, 0);
        }

        for(String phoneNum:phone_book) {
            for(int i=1;i<=phoneNum.length();i++) {
                String perfix = phoneNum.substring(0,i);
                if(!phoneNum.equals(perfix) && map.containsKey(perfix))
                    return false;
            }
        }
        
        
        
        return answer;
    }
}