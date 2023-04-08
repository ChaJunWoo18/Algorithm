import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int tmp = 0;
        int[] answer = new int[numlist.length];
        int[] arr = new int[numlist.length];
        for(int i=0;i<numlist.length;i++) {
            arr[i] = numlist[i]-n;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<numlist.length;i++) {
            for(int j=i+1;j<numlist.length;j++) {
                if(Math.abs(arr[i])>Math.abs(arr[j])) {
                    tmp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++) {
            if(Math.abs(arr[i])==Math.abs(arr[i+1]) && arr[i]<0) {
                tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++) {
            answer[i] = arr[i] + n;
        }
        return answer;
    }
}