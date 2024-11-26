import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        List<int[]> points = new ArrayList<>();
        for(int i=0;i<n;i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            points.add(new int[] {x,y});
        }
        Collections.sort(points,(p1,p2)->{
            if(p1[0]==p2[0]) {
                return Integer.compare(p1[1],p2[1]);
            }
            return Integer.compare(p1[0], p2[0]);
        });
        for(int[] arr : points) {
            System.out.println(arr[0]+" "+arr[1]);   
        }
        
        
    }
}