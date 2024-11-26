import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] croatianAlpha = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for(String alpha : croatianAlpha) {
            input = input.replace(alpha, "A");
        }
        System.out.println(input.length());
    }
}