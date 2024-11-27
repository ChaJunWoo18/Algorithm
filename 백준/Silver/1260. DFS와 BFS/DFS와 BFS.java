import java.io.*;
import java.util.*;

public class Main {
    static int N, M, V;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 정점의 개수, M: 간선의 개수, V: 시작 정점
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // 그래프 초기화
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);  // 양방향 간선
        }

        // 각 정점의 리스트를 오름차순으로 정렬 (문제 조건)
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // 방문 배열 초기화
        visited = new boolean[N + 1];

        // DFS 탐색
        dfs(V);
        sb.append("\n");
        
        // 방문 배열 초기화
        visited = new boolean[N + 1];

        // BFS 탐색
        bfs(V);
        System.out.println(sb);
    }

    // DFS 구현
    public static void dfs(int v) {
        visited[v] = true;
        sb.append(v + " ");
        for(int i : graph[v]) {
            if(!visited[i]) {
                dfs(i);
            }
        }
    }

    // BFS 구현
    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;

        while(!q.isEmpty()) {
            int current = q.poll();
            sb.append(current).append(" ");
            
            for(int i : graph[current]) {
                if(!visited[i]) {
                    visited[i] = true;  
                    q.offer(i);
                }
            }
        }
    }
}