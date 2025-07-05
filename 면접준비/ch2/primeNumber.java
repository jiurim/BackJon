package 면접준비.ch2;

import java.util.Scanner;

public class primeNumber {
    public static int Solution(int num){
        int answer = 0; 

        int [] array = new int[num+1];

        for(int i =2 ; i<=num; i++){
            if(array[i]==0){
                answer++;

                for(int j = i; j<=num ; j=j+i){
                    array[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();

        System.out.print(Solution(num));
    }
    
}
