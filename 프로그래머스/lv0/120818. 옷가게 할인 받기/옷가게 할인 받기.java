class Solution {
    public int solution(int price) {
        int answer = 0;
        double a = 0;
        if (price >= 500000)
            a = price * 0.8;
        else if (price >= 300000 && price <500000)
            a = price * 0.9;
        else if (price >= 100000 && price <300000)
            a = price * 0.95;
        else
            a = price;
        answer = (int)a;
        return answer;
    }
}