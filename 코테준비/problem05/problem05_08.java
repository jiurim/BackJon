package 코테준비.problem05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class problem05_08 {
    public static int Solution(int n, int k, int[] arr){
        int answer = 0;
        
        Queue<Person> Q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            Q.offer(new Person(i,arr[i]));
        }

        while(!Q.isEmpty()){
            Person tmp = Q.poll();

            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if(tmp!=null){
                answer++;
                if(tmp.id==k){
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] patient = new int[N];
        for(int i = 0; i<N; i++){
            patient[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(Solution(N,K,patient));
    }
    
}
