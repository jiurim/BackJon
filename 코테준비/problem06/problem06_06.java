package 코테준비.problem06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problem06_06 {

    public static ArrayList<Integer> Solution(int[] arr) {
        int[] temp = new int[arr.length];
        
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i =0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=temp[i]){
                answer.add(i+1);
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int x : Solution(arr)){
            System.out.print(x+" ");
        }
    }
    
}

// 첫 풀이( 오답 )
// public class Main {

//     public static int[] Solution(int[] arr) {
//         int[] answer = new int[2];
//         int midIndex = arr.length / 2;
//         int pivot = arr[midIndex];
    
//         // 왼쪽에서 pivot보다 큰 값 찾기 (이건 철수의 키)
//         for (int i = midIndex - 1; i >= 0; i--) {
//             if (arr[i] > pivot) {
//                 answer[0] = i+1;
//                 break; // 첫 번째 발견하면 멈춤
//             }
//         }
    
//         // 오른쪽에서 pivot보다 작은 값 찾기 (이건 짝궁의 키)
//         for (int i = midIndex + 1; i < arr.length; i++) {
//             if (arr[i] < pivot) {
//                 answer[1] = i+1;
//                 break;
//             }
//         }
    
//         return answer;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr = new int[n];

//         for(int i =0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         sc.close();

//         for(int x : Solution(arr)){
//             System.out.print(x+" ");
//         }
//     }
    
// }