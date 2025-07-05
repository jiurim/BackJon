package 코테준비.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem02_05 {
    public static int Solution(int x){
        int cnt = 0;
        int [] ch = new int[x+1];

        for(int i = 2; i<=x; i++){
            if(ch[i]==0){
                cnt++;
                for(int j = i; j<=x; j=j+i){
                    ch[j] = 1;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(buf.readLine());
        System.out.println(Solution(input));
    }
    
}
