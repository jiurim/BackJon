package 코테준비.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem02_04 {

    public static int[] fibo (int a){
        int [] answer = new int[a];

        answer[0] = 1;
        answer[1] = 1;
        for(int i = 2; i<a; i++){
            answer[i] = answer[i-1]+answer[i-2];
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(buf.readLine());

        for(int x : fibo(cnt)){
            System.out.print(x+" ");
        }
    }
    
}
