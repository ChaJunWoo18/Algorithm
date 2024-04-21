class Solution {
    public int solution(int n) {
        int battery = 0;
        
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2; // 순간이동
            } else {
                n--; // 점프
                battery++; // 건전지 사용량 증가
            }
        }
        
        return battery;
    }
}
