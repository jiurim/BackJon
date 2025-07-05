package 코테준비.problem03;

import java.util.Scanner;

public class problem03_04 {
    public static int Solution(int n, int m, int[] arr){
        int answer = 0;
        int sum = 0;
        int lt = 0;
        
        for(int rt = 0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m){
                answer++;
            }
            while(sum>=m){
                sum-=arr[lt];
                lt++;
                if(sum==m){
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print(Solution(n,m,arr));
    }
    
}
