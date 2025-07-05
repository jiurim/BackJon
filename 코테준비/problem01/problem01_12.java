package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_12 {
    public static String Solution(int count, String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<count;i++){
            String temp = str.substring(0,7).replace('#', '1').replace('*', '0');
            int binary = Integer.parseInt(temp,2);
            char asc = (char)binary;
            sb.append(asc);
            str = str.substring(7);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buf.readLine());
        String input = buf.readLine();
        System.out.println(Solution(cnt,input));
        
    }
    
}
