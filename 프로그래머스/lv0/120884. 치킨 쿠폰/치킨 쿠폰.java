class Solution {
    public int solution(int chicken) {
        int serv = 0, answer = 0, tmp = 0;
        while(chicken >= 10) {
            tmp = chicken % 10;
            serv = chicken / 10;
            chicken = serv + tmp;
            answer += serv;
        }
        return answer;
    }
}