import java.util.Arrays;
class Solution {
    public String solution(int age) {
        String answer = "";
        String num = String.valueOf(age);
        String[] arr = num.split("");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            answer+=(char)(Integer.parseInt(arr[i])+97); 
            //97은 아스키코드 a의 문자화
        }
        return answer;
    }
}