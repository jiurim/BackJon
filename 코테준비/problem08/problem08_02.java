package 코테준비.problem08;

import java.util.Scanner;

public class problem08_02 {
    static String answer = "NO";
    static int n=0;
    static int total = 0;

    static boolean flag = false;

    public static void DFS(int L, int sum, int[] arr){
        if(flag == true){
            return;
        }

        if(sum>total/2){
            return;
        }

        if(L==n){
            if((total - sum)==sum){
                answer = "YES";
                flag = true;
            }
        }else {
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n= sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            total+=arr[i];
        }   

        sc.close();;

        if(total%2!=0){
            System.out.println("NO");
            return;
        }

        DFS(0,0,arr);
        System.out.println(answer);
    }
}
