import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse={".-","a","-...","b","-.-.","c","-..","d",".","e","..-.","f","--.","g","....","h","..","i",".---","j","-.-","k",".-..","l","--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r","...","s","-","t","..-","u","...-","v",".--","w","-..-","x","-.--","y","--..","z"};
        String[] letter_ar=letter.split(" ");
        System.out.println(Arrays.toString(letter_ar));
        String[] answer_array=new String[letter_ar.length];
        for(int i=0;i<letter_ar.length;i++){
            for(int j=0;j<morse.length;j++){
                if(letter_ar[i].equals(morse[j])){
                    answer_array[i]=morse[j+1];
                    System.out.println("d");
                }
            }
            System.out.println(Arrays.toString(answer_array));
        }
        String joinString = String.join("", answer_array);
        answer=joinString;
        return answer;
    }
}