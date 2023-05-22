import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        String st ="";
        String tmp = "";
        
        HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
            put(0,"zero"); put(1,"one"); put(2,"two"); put(3,"three"); put(4,"four");
            put(5,"five"); put(6,"six"); put(7,"seven"); put(8,"eight"); put(9,"nine");
        }};
        for(int i=0;i<arr.length;i++) {
            if(Character.isDigit(arr[i].charAt(0)))
                tmp += arr[i];
            else{
                st += arr[i];
                if(map.containsValue(st)) {
                    for(Integer a : map.keySet()){
                        if(map.get(a).equals(st)) {
                            tmp+=a;
                        }
                    }
                    st = "";
                } 
            }
        }
        answer = Integer.parseInt(tmp);
        return answer;
    }
}