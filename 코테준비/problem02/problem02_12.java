package 코테준비.problem02;

import java.util.Scanner;

public class problem02_12 {
    public int Solution(int n, int m, int[][] arr){
        int answer =0;

        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int pi=0;
                    int pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i){
                            pi =s;
                        }
                        if(arr[k][s]==j){
                            pj =s;
                        }
                    }
                    if(pi<pj){
                        cnt++;
                    }
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        problem02_12 T = new problem02_12();
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
    
        int [][] score = new int[M][N]; 
    
        for(int i =0; i<M; i++){
            for(int j = 0; j<N; j++){
                score[i][j] = sc.nextInt();
            }
        }
    
        sc.close();
        System.out.println(T.Solution(N, M, score));
    }    
}
