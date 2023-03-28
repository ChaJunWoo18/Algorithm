class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] arr = my_string.toCharArray();
        // a ~ z 97 ~122
		// A ~ Z 65~90
        for(int i = 0; i<arr.length; i++) {
			if(arr[i] >= 97 && arr[i] <= 122 ) {
				answer += Character.toString(arr[i]).toUpperCase();
			} 
            else if(arr[i] >= 65 && arr[i] <= 90){
				answer += Character.toString(arr[i]).toLowerCase();
			}
		}
        return answer;
    }
}