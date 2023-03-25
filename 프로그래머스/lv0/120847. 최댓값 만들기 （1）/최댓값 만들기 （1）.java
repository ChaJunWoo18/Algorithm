import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // 오름차순 정렬
        //내림차순의 경우 배열을 integer형으로 변경하고 Collections.reverseOrder()사용
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}