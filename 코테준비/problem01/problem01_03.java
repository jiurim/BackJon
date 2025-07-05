package 코테준비.problem01;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class problem01_03 {

    public static String Solution(String str){
        int m = Integer.MIN_VALUE;
        String answer = "";
        String [] txt = str.split(" ");
        for(String s : txt){
            int len = s.length();
            if(len>m){
                m=len;
                answer=s;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String text = buf.readLine();
        System.out.print(Solution(text));

    }
}
