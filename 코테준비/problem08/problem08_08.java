package 코테준비.problem08;

import java.util.Scanner;

//순열문제
public class problem08_08  {
    static int N,M;
    static int[] pm;

    public static void DFS(int L){

        if(L==M){
            for(int x : pm){
                System.out.print(x+" ");
                System.out.println();
            }
        }else{
            for(int i = 1; i<=N; i++){
                pm[L]=i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        pm = new int[M];

        sc.close();

        DFS(0);
    }
}
