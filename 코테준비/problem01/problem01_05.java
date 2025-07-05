package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_05 {
    public static String Solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String input = buf.readLine(); 
        System.out.println(Solution(input));
    }
}
