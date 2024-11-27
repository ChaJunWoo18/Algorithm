import java.util.*;
import java.io.*;

public class Main {
    static int cnt=  0;
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i =0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i =0;i<n;i++) {
            find(arr[i]);
        }
        System.out.println(cnt);
    }
    public static void find(int n) {
        if(n<=1) return;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return;
            }
        }
        cnt++;
    }
}