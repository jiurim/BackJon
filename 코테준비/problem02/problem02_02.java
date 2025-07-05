package 코테준비.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem02_02 {
    public static int Solution(int j , int[] array){
        int cnt = 1;
        int max = array[0];

        for(int i = 0 ; i<j; i++){
            if(array[i]>max){
                cnt++;
                max=array[i];
            }
            
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(buf.readLine());
        String [] value = buf.readLine().split(" ");
        int [] student = new int[cnt];

        for(int i = 0 ; i<cnt; i++){
            student[i] = Integer.parseInt(value[i]);
        }

        System.out.println(Solution(cnt, student));
        
    }
    
}
