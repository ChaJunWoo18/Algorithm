import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[10000];
        for(int i=0;i<arr.length;i++) {
            int num = d(i+1);
            if(num <= 10000) {
                arr[num -1] = true; 
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==false) {
                sb.append(i+1).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static int d(int n) {
        int sum = n;
        while(n!=0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}