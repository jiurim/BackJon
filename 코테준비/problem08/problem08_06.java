package 코테준비.problem08;

import java.util.Scanner;

public class problem08_06 {
    static int N = 0;
    static int [][] dy = new int[35][35];
    public static int DFS(int n, int r){

        if(dy[n][r]>0){
            return dy[n][r];
        }
        if(n==r || r==0){
            return 1;
        }else{
            return dy[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int R = sc.nextInt();
        sc.close();
        System.out.println(DFS(N,R));
    }
    
}
