package 코테준비.problem06;

import java.util.HashSet;
import java.util.Scanner;

//hashset을 활용한 중복값 확인

public class problem06_05 {
    public static String Solution(int[] arr){
        HashSet<Integer> hs = new HashSet<>();

        String answer="U";

        for(int x : arr){
            if (!hs.add(x)) { // add가 false면 중복
                answer="D";
            }
            hs.add(x);
        }
        
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr =new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.print(Solution(arr));
    }
    
}
