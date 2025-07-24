package 코테준비.problem02;

import java.util.Scanner;

public class problem02_09 {

    public static int Solution(int num , int[][] score){
        int sum1, sum2;
        int max = 0;

        for(int i = 0; i<num; i++){
            sum1=0;
            sum2=0;

            for(int j = 0; j<num; j++){
                sum1+=score[i][j];
                sum2+=score[j][i];
            }

            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        sum1 = 0;
        sum2 = 0;

        for(int i=0; i<num; i++){
            sum1+=score[i][i];
            sum2+=score[i][num-i-1];
        }

        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int [][] score = new int[num][num];

        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++){
                score[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println(Solution(num, score));
    }
    
}
