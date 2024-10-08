import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {

    static int N;
    static int [][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringtokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringtokenizer.nextToken());
        int M = Integer.parseInt(stringtokenizer.nextToken());

        graph = new int[N + 1][N + 1]; // 인덱스를 1부터 시작하므로 N+1 크기로 생성

        for (int i = 0; i < M; i++) { // M 만큼 간선 입력
            stringtokenizer = new StringTokenizer(bufferedReader.readLine());
            int trunk1 = Integer.parseInt(stringtokenizer.nextToken()); // 간선의 한 끝점
            int trunk2 = Integer.parseInt(stringtokenizer.nextToken()); // 간선의 다른 끝점

            graph[trunk1][trunk2] = 1; // 간선 추가
            graph[trunk2][trunk1] = 1; // 방향 없는 그래프이므로 반대 방향도 추가
        }

        int count = 0; // 연결 요소 카운트 초기화
        int[] visited = new int[N + 1]; // 방문 여부 배열

        for (int i = 1; i <= N; i++) {
            if (visited[i] == 0) { // 방문하지 않은 노드 발견
                dfs(i, visited); // DFS 실행
                count++; // 연결 요소 카운트 증가
            }
        }

        System.out.println(count); // 연결 요소 수 출력
    }
    
    public static void dfs(int start, int[] visited) {
        Stack<Integer> stack = new Stack<>();

        stack.add(start); // 시작 정점 스택에 추가
        visited[start] = 1; // 시작 정점 방문 표시

        while (!stack.isEmpty()) {
            int index = stack.pop(); // 스택에서 하나 꺼냄

            for (int neighbor = 1; neighbor <= N; neighbor++) {
                if (graph[index][neighbor] == 1 && visited[neighbor] == 0) { // 인접하고 미방문 노드라면
                    visited[neighbor] = 1; // 방문했다고 표시
                    stack.push(neighbor); // 새로운 인접 노드를 스택에 넣음
                }
            }
        }
    }
}
