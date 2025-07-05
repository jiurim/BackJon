package 코테준비.problem08;

import java.util.Scanner;

public class problem08_09 {
    static int [] pm, ch, arr;
    static int N,M;

    public static void DFS(int L){
        if(L==M){
            for(int x : pm){
                System.out.print(x+" ");
                System.out.println();
            }
        }else {
            for(int i = 0; i<N; i++){
                if(ch[i]==0){
                    ch[i] =1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        
        for(int i = 0; i< N; i++){
            arr[i] = sc.nextInt();
        }
        //체크배열 숫자 확인용
        ch = new int[N];
        pm = new int[M];

        sc.close();

        DFS(0);
    }
    
}
