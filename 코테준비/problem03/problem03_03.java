package 코테준비.problem03;

import java.util.Scanner;

public class problem03_03 {
    public static int Solution(int n, int k, int[] arr){
        int answer = 0;
        int sum =0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        answer=sum;

        for(int i=k;i<n;i++){
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer,sum);
        }
        return answer;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int [] input = new int[N];
        for(int i=0;i<N;i++){
            input[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(Solution(N,K,input));

    }
    
}
