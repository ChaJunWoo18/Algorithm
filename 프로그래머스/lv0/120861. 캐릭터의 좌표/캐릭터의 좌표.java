import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] arr = {0,0};
        int x = board[0]/2, y = board[1]/2;
        for(String i:keyinput) {
            if(i.equals("left") && arr[0] > -x)
                arr[0]--;
            else if(i.equals("right") && arr[0] < x)
                arr[0]++;
            else if(i.equals("up") && arr[1] < y)
                arr[1]++;
            else if(i.equals("down") && arr[1] > -y)
                arr[1]--;
            System.out.println(arr[1]);
        }
        return arr;
    }
}