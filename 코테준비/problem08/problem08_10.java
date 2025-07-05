package 코테준비.problem08;

import java.util.Arrays;
import java.util.Scanner;

public class problem08_10 {
    public static int Solution(int n, int m, int[] arr){
        int answer = 1;
        
        int lt = 0;
        int rt = n-1;

        while(lt<=rt){
            int mid = (lt+rt)/2;

            if(arr[mid]>m){
                rt = mid-1;
            }else if(arr[mid]<m){
                lt=mid+1;
            }
            if(arr[mid]==m){
                answer = mid+1;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] arr = new int [N];
        for(int i = 0; i< N ;  i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        sc.close();

        System.out.println(Solution(N,M,arr));
    }
}
