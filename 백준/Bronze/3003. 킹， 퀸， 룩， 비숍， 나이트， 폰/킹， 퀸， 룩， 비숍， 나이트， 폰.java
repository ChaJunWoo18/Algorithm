import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1,1,2,2,2,8};
        for(int i=0;i<arr.length;i++) {
            int val = arr[i] - Integer.parseInt(st.nextToken());
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }
}