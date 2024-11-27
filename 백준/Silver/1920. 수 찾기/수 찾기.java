import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arrN = new int[n];
        for(int i=0;i<n;i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] arrM = new int[m];
        for(int i=0;i<m;i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrN);
        for(int el : arrM) {
            sb.append(find(arrN, el, 0, arrN.length-1)).append("\n");
        }
        System.out.println(sb);
    }
    public static int find(int[] arr, int target,int start, int end) {
        if(start > end) return 0;
        int mid = (start+end) /2;
        if(arr[mid] == target) return 1;
        else if(arr[mid] > target) {
            return find(arr, target, start, mid -1);
        } else {
            return find(arr, target, mid+1, end);
        }
    }
}