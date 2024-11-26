import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0;i<n.length();i++) {
            arrList.add(n.charAt(i)- '0');
        }
        Collections.sort(arrList, Comparator.reverseOrder());
        for(int i=0;i<n.length();i++) {
            sb.append(arrList.get(i));
        }
        System.out.println(sb);
    }
}