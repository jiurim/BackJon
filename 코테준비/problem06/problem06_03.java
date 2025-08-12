package 코테준비.problem06;

import java.util.Scanner;

//삽입정렬
public class problem06_03 {

    public static int [] Solution(int n, int arr[]){
        int i, j, temp;

        for (i = 1; i < n; i++){ // 삽입정렬의 첫 시작은 2번째부터
            temp = arr[i];
            for (j = i-1; j >= 0; j--){ // i-1번부터 처음까지 하나씩 비교하면서 넣으므로
                if (arr[j] > temp){ // 비교값이 더 크면 한칸씩 당김
                arr[j+1] = arr[j];
                }
                else{ // 삽입할 곳 찾음
                    break;
                }

            }
            arr[j+1] = temp; // 삽입할 곳에 값 넣음
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
