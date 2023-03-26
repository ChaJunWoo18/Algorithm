class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if(Character.isDigit(arr[i])) {
                answer += arr[i]-48; //char를 int형answer에 넣으면
                //아스키코드 값이 들어가므로 -48을 통해 해결
            }
        }
        return answer;
    }
}