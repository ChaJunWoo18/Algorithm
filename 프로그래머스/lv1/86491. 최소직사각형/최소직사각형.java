import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0, min = 0;
        int a=0, b=0;
        for(int i=0;i<sizes.length;i++) {
            for(int j=0;j<2;j++) {
                if(max < sizes[i][j]) {
                    max = sizes[i][j];
                    b=j;
                    a=i;
                }
            }
        }
        for(int i=0;i<sizes.length;i++) {
            if((b == 1 && sizes[i][0]>sizes[i][1]) || (b==0 && sizes[i][0]<sizes[i][1])) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
            if(b==1 && min < sizes[i][0])
                min = sizes[i][0];
            else if(b==0 && min < sizes[i][1])
                min = sizes[i][1];
            System.out.println(Arrays.toString(sizes[i]));
        }
        
        return min * max;
    }
}