class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] arr = new String[str.length()];
        arr = str.split("");
        for(String i:arr) {
            answer+=Integer.parseInt(i);
        }
        return answer;
    }
}