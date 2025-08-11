package 코테준비.problem06;

import java.util.Scanner;

public class problem06_03 {

    public static int [] Solution(int n, int arr[]){
        int i, j, temp;

        for (i = 1; i < n; i++){ // 첫 시작은 2번째부터니 배열 인덱스 a[1]번부터 시작
            temp = arr[i];                 // 삽입 값을 temp 변수에 저장
            for (j = i-1; j >= 0; j--){ // i-1번부터 처음까지 하나씩 비교하면서 넣으므로
                if (arr[j] > temp){ // 비교값이 더 크면 한칸씩 당긴다.
                arr[j+1] = arr[j];
                }
                else{ // 비교값이 더 작으면 삽입할 곳을 찾았으므로 멈춘다.
                    break;
                }

            }
            arr[j+1] = temp; // 삽입할 곳에 값을 넣는다.    
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

        for(int x : Solution(n, arr)){
            System.out.print(x + " ");
        }
        
    }
    
}
