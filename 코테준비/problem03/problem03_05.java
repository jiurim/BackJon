package 코테준비.problem03;

import java.util.Scanner;

public class problem03_05 {
    public int Solution(int n){
        int answer =0; 
        int cnt =1;

        n--; //1빼기 
        while(n>0){
            cnt++;
            n=n-cnt; //2빼기

            if(n%cnt==0){//이 경우 연속된 자연수가 가능함
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        problem03_05 t = new problem03_05();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();
        System.out.println(t.Solution(N));
    }
    
}
