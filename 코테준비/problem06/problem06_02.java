package 코테준비.problem06;

import java.util.Scanner;

//버블정렬
public class problem06_02 {
    public static int [] Solution(int n, int[] arr){

        int temp;

        for(int i =0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        for(int x : Solution(n,arr)){
            System.out.print(x+" ");
        }
    }
    
}
