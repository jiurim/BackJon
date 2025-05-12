import java.util.*;
class Point{
    public int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    static int [] dx = {0,1,0,-1};
    static int [] dy = {-1,0,1,0};
    Queue<Point> Q = new LinkedList<>();
    static int [][] dis;
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        dis = new int[n][m];
        dis[0][0]=1;
        bfs(0,0,maps,n,m);
        
        if (dis[n - 1][m - 1] == 0) return -1;
        return dis[n - 1][m - 1];
    }
    private void bfs(int x, int y, int[][]maps, int n, int m){
        Q.offer(new Point(x,y));
        maps[x][y]=0;
        
        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            
            for(int i = 0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                
                if(nx>=0&&nx<n&&ny>=0&&ny<m&&maps[nx][ny]==1){
                    maps[nx][ny]=0;
                    Q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }
}