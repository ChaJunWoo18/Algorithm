import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}