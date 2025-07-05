package 코테준비.problem03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem03_02 {
    public static List<Integer> Solution(int cnt1, int[] input1, int cnt2, int[] input2){
        List<Integer> answer = new ArrayList<>();
        
        int min =0;
        int max = 0;
        int[] min_input = {};
        int[] max_input = {};

        if(cnt1>=cnt2){
            min = cnt2;
            max = cnt1;
            min_input = input2;
            max_input = input1;
        }else if(cnt2>cnt1){
            min = cnt1;
            max = cnt2;
            min_input = input1;
            max_input = input2;
        }

        for(int i=0;i<min;i++){
            for(int j=0;j<max;j++){
                if(min_input[i]==max_input[j]){
                    answer.add(max_input[j]);
                }
            }
        }
        
        answer.sort(null);
        return answer;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int cnt1 = sc.nextInt();
        int[] input1 = new int[cnt1];
        for(int i=0;i<cnt1;i++){
            input1[i] = sc.nextInt();
        }
        

        int cnt2= sc.nextInt();
        int[] input2 = new int[cnt2];
        for(int i=0;i<cnt2;i++){
            input2[i] = sc.nextInt();
        }

        sc.close();

        for(int x : Solution(cnt1,input1,cnt2,input2)){
            System.out.print(x+" ");
        }
        
    }
    
}
