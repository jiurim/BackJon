package 코테준비.problem08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem08_05 {
    static int N, M ,answer = Integer.MAX_VALUE;

    public static void DFS(int L, int sum, Integer[] type){

        if(sum>M){
            return;
        }
        if(L>=answer){
            return;
        }
        if(sum==M){
            answer = Math.min(answer,L);
        }
        else{
            for(int i = 0; i<N;i++){
                DFS(L+1, sum+type[i], type);
            }
        }
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        Integer [] type = new Integer[N];

        for(int i = 0; i<N; i++){
            type[i] = sc.nextInt();
        }
        Arrays.sort(type,Collections.reverseOrder());

        M = sc.nextInt();

        sc.close();

        DFS(0,0,type);

        System.out.println(answer);
    }
    
}
