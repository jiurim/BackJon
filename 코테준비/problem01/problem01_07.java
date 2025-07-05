package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_07 {
    public static String Solution(String str){
        String [] s = new String[str.length()];
        for(int i = 0; i<s.length;i++){
            s[i] = String.valueOf(str.charAt(i));
        }

        int lt =0;
        int rt = s.length-1;
        String answer="YES";

        while(lt<rt){
            if(s[lt]!= s[rt]){
                answer="NO";
                break;
            }
            lt++;
            rt--;
        }
        return answer;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String input = buf.readLine().toLowerCase();
        System.out.println(Solution(input));
    }
    
}
