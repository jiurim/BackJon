package 코테준비.problem06;

import java.util.Scanner;

//선택정렬

public class problem06_01 {
    public static int [] Solution(int n, int[]arr){

        for(int i=0; i<n-1; i++){
            int index = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
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
            System.out.print(x + " ");
        }
    }
}
