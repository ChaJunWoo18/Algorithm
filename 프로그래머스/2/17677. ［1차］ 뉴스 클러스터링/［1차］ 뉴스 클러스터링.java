import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String> list1 = splitList(str1);
        ArrayList<String> list2 = splitList(str2);
        //list1+list2
        ArrayList<String> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);
        boolean allSame = true;
        for(int i=0;i<combinedList.size()-1;i++) {
            if(!combinedList.get(i).equals(combinedList.get(i+1))) {
                allSame = false;
                break;
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        int sum = list1.size()+list2.size();
        //교집합 찾기
        double intersection = 0;
        for (int i = 0;i< list2.size();i++) {
            if (list1.contains(list2.get(i))) {
                int removeIdx = list1.indexOf(list2.get(i));
                list1.set(removeIdx, "");
                intersection++;
            }
        }
        double union = sum -intersection;
        if(allSame && union < intersection) {
            double tmp = intersection;
            intersection = union;
            union = tmp;
        }
        if(union+intersection==0) return 65536;
        double d = intersection/union * 65536;
        
        return (int)d;
    }
    private ArrayList<String> splitList(String str) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char c:str.toCharArray()) {
            if(Character.isAlphabetic(c)) 
                sb.append(c);
            else
                sb.setLength(0);
            if(sb.length()==2) {
                list.add(sb.toString());
                sb.setLength(0);
                sb.append(c);
            }  
        }
        return list;
    }
}