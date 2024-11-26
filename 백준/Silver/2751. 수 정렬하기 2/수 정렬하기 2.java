import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arrList.add(Integer.parseInt(br.readLine()));

        }
        Collections.sort(arrList);
        for(int i=0;i<n;i++) {
            sb.append(arrList.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}