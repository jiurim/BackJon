package 코테준비.problem02;

import java.util.Scanner;

public class problem02_11 {

    public static int Solution(int n, int[][] arr){
        int answer = 0;

        int max = Integer.MIN_VALUE;

        for(int i =1; i<=n; i++){
            int cnt = 0;
            for(int j = 1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n+1][6];

        for(int i =1; i<=n; i++){
            for(int j =1; j<=5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println(Solution(n, arr));
    }
}
