package 면접준비.ch2;

import java.util.Scanner;

public class fibo {
    public static int[] Solution(int input){
        int [] answer = new int[input];

        answer[0] = 1;
        answer[1] = 1;

        for(int i =2; i<input; i++){
            answer[i] = answer[i-1]+answer[i-2];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        sc.close();

        int [] answer = Solution(input);
        for(int i=0; i<input; i++){
            System.out.print(answer[i]+" ");
        }

    }
    
}
