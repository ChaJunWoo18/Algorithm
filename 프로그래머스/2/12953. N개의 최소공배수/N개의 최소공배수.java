class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i=1;i<arr.length;i++) {
            answer = gcd(arr[i-1], arr[i]);
            arr[i] = (arr[i-1] * arr[i]) / answer;
            System.out.println(arr[i]);
        }
        answer = arr[arr.length-1];
        return answer;
    }
    public int gcd(int a, int b) {
        while(b !=0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}