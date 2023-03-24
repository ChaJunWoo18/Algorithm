class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        String ans = "";
        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals("2")) {
                ans += "0";
            }
            else if(arr[i].equals("0")) {
                ans += "5";
            }
            else if(arr[i].equals("5")) {
                ans += "2";
            }
        }
        return ans;
    }
}