import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int Row, Col;
    static int[][] map;

    static int DFS(int i, int j) {
        int size = 1;
        map[i][j] = 0;  // 방문 처리

        for (int a = 0; a < 4; a++) {
            int ai = i + dx[a];
            int aj = j + dy[a];

            if (ai >= 0 && ai < Row && aj >= 0 && aj < Col && map[ai][aj] == 1) {
                size += DFS(ai, aj); // 연결된 덩어리 크기 누적
            }
        }

        return size;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int max = 0;

        Row = Integer.parseInt(st.nextToken());
        Col = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        map = new int[Row][Col];

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(bf.readLine());
            int trashRow = Integer.parseInt(st.nextToken()) - 1;
            int trashCol = Integer.parseInt(st.nextToken()) - 1;
            map[trashRow][trashCol] = 1;
        }

        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                if (map[i][j] == 1) {
                    int result = DFS(i, j);
                    max = Math.max(max, result);
                }
            }
        }

        System.out.println(max);
    }
}
