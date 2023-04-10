class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        System.out.println(sum);
        String s = Integer.toString(sum, 2);
        
        return s;
    }
}