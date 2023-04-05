import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] arr = new int[board.length+2][board.length+2];
        
        for(int i=1;i<arr.length-1;i++) {
            for(int j=1;j<arr.length-1;j++) {
                arr[i][j] = board[i-1][j-1];
            }
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[i][j] == 1){
                    for(int x=i-1;x<=i+1;x++) {
                        for(int y=j-1;y<=j+1;y++) {
                            if(arr[x][y] != 1)
                                arr[x][y] = 2;
                        }
                    }
                }
            }
        }
        for(int i=1;i<arr.length-1;i++) {
            for(int j=1;j<arr.length-1;j++) {
                if(arr[i][j] ==0) answer++;
            }
        }
        return answer;
    }
}