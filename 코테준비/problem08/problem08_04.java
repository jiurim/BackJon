package 코테준비.problem08;

import java.util.Scanner;

public class problem08_04 {
    static int N,M,answer,total_score, total_time= 0;

    public static int DFS(int L, int total_score, int total_time,int[] score, int[] time){
        
        if(total_time>M){
            return answer;
        }
        if(L==N){
            answer = Math.max(answer, total_score);
        }else {
            DFS(L+1, total_score+score[L],total_time+time[L],score,time);
            DFS(L+1,total_score,total_time,score,time);

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        int [] score = new int[N];
        int [] time = new int[N];

        for(int i = 0; i<N; i++){
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        sc.close();
        DFS(0,0,0,score,time);
        System.out.println(answer);
    }
    
}
