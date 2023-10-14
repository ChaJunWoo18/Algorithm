import java.io.*;
import java.util.*;

class Main {
    //dfs
    public static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        if(V == graph.length) {
            return;
        }
        for(int j = 1; j < graph.length; j++) {
            if(graph[V][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }
    }

    //bfs
    public static void bfs(int V) {
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(V);
        visited[V] = true;
        System.out.print(V + " ");

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 1; i < graph.length; i++) {
                if(graph[temp][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static int[][] graph;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        visited = new boolean[N + 1];
        graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(V);
        System.out.println();
        visited = new boolean[N + 1];
        bfs(V);
    }
}
