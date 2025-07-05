package 코테준비.problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class problem04_03 {
    public static ArrayList<Integer> Solution(int N, int K, int[] input){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i =0; i<K-1;i++){
            map.put(input[i], map.getOrDefault(input[i], 0)+1);
        }

        int lt = 0;
        for(int rt = K-1;rt<N; rt++){
            map.put(input[rt],map.getOrDefault(input[rt], 0)+1);
            answer.add(map.size());
            map.put(input[lt], map.get(input[lt])-1);
            if(map.get(input[lt])==0){
                map.remove(input[lt]);
            }
            lt++;

        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] input = new int[N];
        for(int i =0; i<input.length; i++){
            input[i] = sc.nextInt();
        }
        sc.close();

        for(int x : Solution(N,K,input)){
            System.out.print(x+" ");
        }
    }
    
}
