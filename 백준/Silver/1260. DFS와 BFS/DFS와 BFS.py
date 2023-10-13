from collections import deque
    
def dfs(graph, v, visited):
    visited[v] = True #현재 노드를 방문 처리
    print(v, end=' ')
    for i in graph[v]: # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        if not visited[i]:
            dfs(graph, i, visited)
            
def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True
    # 큐가 빌 때까지 반복
    while queue:
        # 큐에서 하나의 원소를 뽑아 출력하기
        v = queue.popleft()
        print(v, end=' ')
        # 아직 방문하지 않은 인접한 원소들을 큐에 삽입
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True
                
N, M, V = map(int, input().split())
graph = []
for i in range(N+1):
    graph.append([])
for i in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in graph:
    i.sort()  

dfs(graph, V, [False] * (N+1))
print()
bfs(graph, V, [False] * (N+1))