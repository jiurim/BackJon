package 코테준비.problem08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem08_01 {

    public static int BFS(int s, int e){

        int answer = 0;
        int [] dis = {1,-1,5};
        //한번 들어간 값은 안넣기 위한 체크 배열
        int [] check;
        Queue<Integer> Q = new LinkedList<>();

        check = new int[10001];
        check[s] = 1;
        Q.offer(s);

        int level = 0;

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i<len;i++){
                int x = Q.poll();
                if(x==e){
                    return level;
                }
                for(int j = 0; j<3; j++){
                    int nx = x+dis[j];
                    if(nx>=1 && nx<=10000 &&check[nx]==0){
                        check[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int E = sc. nextInt();

        sc.close();

        System.out.println(BFS(S,E));

        
    }
    
}
