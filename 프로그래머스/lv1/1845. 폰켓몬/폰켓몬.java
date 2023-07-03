import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i:nums)
            list.add(i);
        list = new ArrayList<>(
            list.stream().distinct().collect(Collectors.toList())
        ); // list.size()는 폰켓몬의 종류
        System.out.println(list);
        answer = list.size() <= nums.length/2 ? list.size() : nums.length/2;
        return answer;
    }
}