import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> obj = Arrays.asList(my_string.split(""));//리스트 형태로 바꿈
        List<String> newList = obj.stream().distinct().collect(Collectors.toList());//중복값 제거
        answer = String.join("", newList);//str형태로 바꿈
        return answer;
    }
}