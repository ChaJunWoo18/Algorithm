import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String a = "";
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0;i<dartResult.length();i++) {
            if(Character.isDigit(dartResult.charAt(i))) {
                a += dartResult.substring(i,i+1);
            }
            else if(dartResult.substring(i,i+1).equals("*")||dartResult.substring(i,i+1).equals("#")) {
                continue;
            }
            else {
                num.add(Integer.parseInt(a));
                a = "";
            }
        } // dartResult에서 숫자만 추출하여 arraylist에 삽입함
        System.out.println(num);
        int chance = 0; // 기회 3번 세기, num에서 숫자 꺼낼때 S,D,T가 몇번째 던진애랑 맞는지 확인해야함.
        String[] arr = dartResult.split("");
        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals("S")) chance ++;
            else if(arr[i].equals("D")) {
                chance++;
                for(int j=1;j<=3;j++) {
                    if(chance==j) num.set(j-1, num.get(j-1) * num.get(j-1)); 
                }
            }
            else if(arr[i].equals("T")) {
                chance++;
                for(int j=1;j<=3;j++) {
                    if(chance==j) num.set(j-1, num.get(j-1) * num.get(j-1) * num.get(j-1)); 
                }
            }
            else if(arr[i].equals("#")) {
                for(int j=1;j<=3;j++) {
                    if(chance==j) num.set(j-1, num.get(j-1) * -1); 
                }
            }
            else if(arr[i].equals("*")) {
                if(chance == 1) {
                    num.set(0, num.get(0) * 2);
                }
                else {
                    for(int j=2;j<=3;j++) {
                        if(chance==j) {
                            num.set(j-1, num.get(j-1) * 2);
                            num.set(j-2, num.get(j-2) * 2);
                        }
                    }   
                }
            } 
            else  continue;//숫자인경우
        }// num값들을 set메소드를 이용해서 제곱 계산 결과로 바꿈.
        System.out.println(num);
        for(int i=0;i<num.size();i++) 
            answer += num.get(i);
        
        return answer;
    }
}