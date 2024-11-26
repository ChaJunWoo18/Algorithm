import java.util.*;
import java.io.*;

public class Main {
    static int count = 0;
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char preAlpha = ' ';
        for(int i=0;i<word.length();i++) {
            char currentChar = word.charAt(i);
            if(seen[currentChar - 'a'] && currentChar != preAlpha) {
                return false;
            }
            seen[currentChar - 'a'] = true;
            preAlpha =currentChar;
        }
        return true;
    } 
}