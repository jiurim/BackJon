package 코테준비.problem08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    public int x ,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class problem08_13 {
    static int[][] board, check;
    static int m,n;
    static Queue<Point> Q = new LinkedList<>();
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void BFS(){
        

        while(!Q.isEmpty()){
            int size = Q.size();
            for(int a = 0; a<size; a++){
                Point tmp = Q.poll();
                for(int i = 0; i<4; i++){
                    int nx = tmp.x+dx[i];
                    int ny = tmp.y+dy[i];
    
                    if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){
                        board[nx][ny]=1;
                        Q.offer(new Point(nx,ny));
                        check[nx][ny] = check[tmp.x][tmp.y]+1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        board = new int[n][m];
        check = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                board[i][j] = sc.nextInt();

                if(board[i][j]==1){
                    Q.offer(new Point(i, j));
                }
            }
        }
        sc.close();

        BFS();

        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j]==0){
                    flag= false;
                }
            }
        }

        if(flag){
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    answer = Math.max(answer, check[i][j]);
                }
            }

            System.out.println(answer);
        }
        else{
            System.out.println(-1);
        }
    }

}
