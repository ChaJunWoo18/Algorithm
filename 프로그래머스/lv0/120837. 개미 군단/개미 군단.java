class Solution {
    public int solution(int hp) {
        int answer = 0;
        int ja = 0; //장군개미
        int by = 0; //병정개미
        int il = 0; //일개미
        if(hp >= 5) {
            ja = hp / 5;
            hp %= 5;
        }
        if(hp >=3) {
            by = hp / 3;
            hp %= 3;
        }
        il = hp;
        answer += ja+by+il;
        
        
        return answer;
    }
}