class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(String[] s:db) {
            if(s[0].equals(id_pw[0])){
                if(s[1].equals(id_pw[1])) return "login";
                else return "wrong pw";
            }
        }
        return "fail";
    }
}