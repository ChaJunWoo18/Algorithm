import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 수열 크기
        int[] arr = new int[n]; // 입력 배열
        int[] result = new int[n]; // 결과 배열 (오큰수 저장)

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장하는 스택

        // 배열을 순회하며 오큰수를 찾음
        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        
        // 결과 출력
        for (int res : result) {
            sb.append(res).append(" ");
        }
        System.out.println(sb.toString());
    }
}
