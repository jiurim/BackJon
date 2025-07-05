package 코테준비.problem05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem05_06 {
    public static int Solution(int n , int k){
        int answer = 0;

        Queue<Integer> qu = new LinkedList<>();

        for(int i =1; i<=n; i++){
            qu.offer(i);
        }

        while(!qu.isEmpty()){
            for(int a = 1; a<k; a++){
                qu.offer(qu.poll());
            }
            qu.poll();
            if(qu.size()==1){
                answer = qu.poll();
            }
        }
        
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        sc.close();

        System.out.println(Solution(N,K));
    }
    
}
