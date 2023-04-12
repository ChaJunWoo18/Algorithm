public class Solution {
    public int solution(String A, String B) {
        if (A.length() != B.length()) 
            return -1;
        // A를 반복하여 A의 길이만큼 새로운 문자열을 만듭니다.
        String reA = A + A;
        
        // B가 repeatA에 포함되지 않는다면 밀어서 B를 만들 수 없으므로 -1을 반환합니다.
        if (!reA.contains(B)) 
            return -1;
        
        // B를 만들기 위해 A를 밀어야 하는 횟수를 구합니다.
        int n = 0;
        for (int i = A.length(); i >=0; i--) {
            String shift = A.substring(i) + A.substring(0, i);
            System.out.println(A.substring(i));
            if (shift.equals(B)) {
                return n;
            }
            n++;
        }

        return -1;
    }
}
