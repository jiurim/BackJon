package 코테준비.problem02;

import java.util.Scanner;

public class problem02_07 {

    public static int Solution(int num, int[] answer){
        int total_score = 0;
        int[] score = new int[num];

        for(int i = 0; i < answer.length; i++){
            if(i != 0 && answer[i - 1] == answer[i]){
                score[i] = score[i - 1] + answer[i];
            } else {
                score[i] = answer[i];
            }
        }

        for(int j : score){
            total_score += j;
        }

        return total_score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] answer = new int[num];

        for(int i = 0; i < num ; i++){
            answer[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(Solution(num, answer));
    }
}
