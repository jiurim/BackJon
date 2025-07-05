package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class problem01_06 {
    public static String Solution(String str){
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for(int i = 0;i<str.length();i++){
            set.add(String.valueOf(str.charAt(i)));
        }
        
        StringBuilder sb = new StringBuilder();
        for(String a : set){
            sb.append(a);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String input = buf.readLine();
        System.out.println(Solution(input));
        
    }
    
}
