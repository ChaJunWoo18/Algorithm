import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int max = 0;
        for(int i=1;i<=a && i<=b;i++) {
            if(a%i==0 && b%i==0)
                max =i;
        }//기약분수
        String str = "";
        int 분모 = b / max;
        for(int i=2;i<=분모;i++) {
            while(분모 % i ==0) {
                str += i;
                분모/= i;
            }
        }//분모의 소인수
        String[] arr = str.split("");
		ArrayList<String> list = new ArrayList<>();
		for(String s : arr) {
			if(!list.contains(s)) {
				list.add(s);
			}
		} //소인수된 분모 중복 제거해서 list에 저장
        int sum = 0;
        if(str.equals("")) return 1;
        else if(list.size()==2) {
            for(int i=0;i<list.size();i++) {
                sum += Integer.parseInt(list.get(i));
            }
            if(sum ==7)    return 1;
        }
        else if(list.size()==1 && (list.contains("2") || list.contains("5")))
            return 1;
        return 2;
    }
}