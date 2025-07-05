package 코테준비.problem02;

import java.util.Scanner;

public class problem02_10 {

    public static int Solution(int n, int[][] arr){
        int answer = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                boolean flag = true;
                for(int k = 0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag = false;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int [][] arr = new int[input][input];

        for(int i = 0; i<input; i++){
            for(int j=0; j<input; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(Solution(input, arr));
    }
    
}
