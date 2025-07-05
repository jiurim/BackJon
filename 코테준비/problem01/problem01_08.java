package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_08 {
    public static int Solution(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
        }

        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String input = buf.readLine();
        System.out.println(Solution(input));

        
    }
}
