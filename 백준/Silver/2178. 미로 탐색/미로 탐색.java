import java.util.*;
import java.io.*;

public class Main {
    static int n,m;
    static int[][] visited, maze;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new int[n][m];
        maze = new int[n][m];
        for(int i=0;i<n;i++) {
            String line = br.readLine();
            for(int j=0;j<m;j++) {
                maze[i][j] = line.charAt(j)-'0';
            }
        }
        System.out.println(bfs(0,0));
    }
    public static int bfs(int startX,int startY) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {startX, startY});
        visited[startX][startY] = 1;
        int[][] distance = new int [n][m];
        distance[startX][startY]= 1;
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];

            if(x == n-1 && y==m-1) {
                return distance[x][y];
            }

            for(int d=0;d<4;d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if(nx>=0 && ny>=0 && nx<n && ny<m && visited[nx][ny]==0 && maze[nx][ny]!=0) {
                    visited[nx][ny] =1;
                    distance[nx][ny] = distance[x][y] +1;
                    q.offer(new int[] {nx,ny});
                }
            }
        }
        return -1;
    }
}