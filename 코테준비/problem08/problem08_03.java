package 코테준비.problem08;

import java.util.Scanner;

public class problem08_03 {

    static int C,N,answer=0;

    public static int DFS(int L, int sum, int[] w){

        if(sum>C){
            return answer;
        }
        if(L==N){
            answer= Math.max(answer, sum);
        }else {
            DFS(L+1,sum+w[L],w);
            DFS(L+1,sum,w);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        C = sc.nextInt();
        N = sc.nextInt();

        int[] W = new int[N];

        for(int i=0; i<N; i++){
            W[i] = sc.nextInt();
        }
        
        sc.close();

        DFS(0,0,W);
        System.out.println(answer);
    }
    
}
