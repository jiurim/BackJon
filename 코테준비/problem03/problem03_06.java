package 코테준비.problem03;

import java.util.Scanner;

public class problem03_06 {
    public int Solution(int n, int k, int[] arr){
        int answer = 0;
        int cnt = 0;
        int lt =0;

        for(int rt =0; rt<n; rt++){
            if(arr[rt]==0){
                cnt++;
            }
            while(cnt>k){
                if(arr[lt]==0){
                    cnt--;
                }
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        problem03_06 t = new problem03_06();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];

        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.print(t.Solution(n, k, arr));
    }
}
