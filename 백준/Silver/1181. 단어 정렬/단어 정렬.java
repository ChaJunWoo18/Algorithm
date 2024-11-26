import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            String word =br.readLine();
            if(!list.contains(word)) {
                list.add(word);
            }
        }
        Collections.sort(list,(a,b)->{
            int lengthCompare = Integer.compare(a.length(), b.length());
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            return a.compareTo(b);
        });
        
        for (String word : list) {
            System.out.println(word);
        }
    }
}