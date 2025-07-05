package 코테준비.problem04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class problem04_05 {
    public static int Solution(int n, int k, int[] arr){
        int answer=-1;

        //reversOrder은 내림차순, 없으면 오름차순
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=i+1;j<n; j++){
                for(int l=j+1;l<n;l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        for(int x : Tset){
            cnt++;
            if(cnt==k){
                return x;
            }
        }
        return answer;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int [] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(Solution(N,K,arr));
    }
    
}
