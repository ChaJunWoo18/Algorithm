import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String [] arr = polynomial.split(" ");
        System.out.println(Arrays.toString(arr));
        int x = 0, y=0;
        for(int i=0;i<arr.length;i+=2){
            if(arr[i].contains("x")) {
                if(arr[i].length()==1)
                    x+=1;
                else
                    x += Integer.parseInt(arr[i].replace("x",""));
            }
            else
                y += Integer.parseInt(arr[i]);
        }
        if(y==0 && x!=1)
            answer += x+"x";
        else if(x==0)
            answer += y;
        else if(x==0 && y==0)
            answer = "";
        else if(x==1 && y!=0)
            answer += "x + " + y;
        else if(x==1 && y==0)
            answer += "x";
        else
            answer += x+"x + "+ y;
        return answer;
    }
}