import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
	    float sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] arr = new float[n];
		for(int i=0;i<n;i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		float max = arr[n-1];
		for(float item:arr) {
		    sum += item/max*100;
		}
	    System.out.println(sum/n);
	}
}