class Solution {
    public int solution(int order) {
        int answer = 0;
        String snum = Integer.toString(order);
        int[] arr = new int[snum.length()];
        for (int i = 0; i < snum.length(); i++) {
	        arr[i] = snum.charAt(i) - '0';
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==3 || arr[i]==6 || arr[i]==9)
                answer++;
        }
        return answer;
    }
}