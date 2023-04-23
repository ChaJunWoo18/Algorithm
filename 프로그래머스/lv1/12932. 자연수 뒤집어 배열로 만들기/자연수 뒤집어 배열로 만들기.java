class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String[] arr = Long.toString(n).split("");
        answer = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            answer[i] = Integer.parseInt(arr[arr.length-1-i]);
        }
        return answer;
    }
}