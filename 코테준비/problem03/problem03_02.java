package 코테준비.problem03;

import java.util.*;

public class problem03_02 {
    public static ArrayList<Integer> Solution(int n, int[] a, int m, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int p1 =0, p2=0;

        while(p1<n && p2<m){
            if(a[p1]==b[p2]){
                answer.add(a[p1++]);
                p2++;
            }
            else if(a[p1]<b[p2]){
                p1++;
            }
            else{
                p2++;
            }
        }
        return answer;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++){
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i = 0; i < M; i++){
            arr2[i] = sc.nextInt();
        }

        sc.close();

        for(int x : Solution(N,arr1, M,arr2)){
            System.out.print(x+" ");
        }
    }
}
