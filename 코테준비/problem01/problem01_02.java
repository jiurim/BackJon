package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String text = buf.readLine();
        String [] txt = text.split("");

        for(int i = 0;i<text.length();i++){
            if(Character.isUpperCase(txt[i].charAt(0))){
                txt[i]= txt[i].toLowerCase();
            }
            else if(Character.isLowerCase(txt[i].charAt(0))){
                txt[i]= txt[i].toUpperCase();
            }
        }
        for(String s : txt){
            System.out.print(s);
        }
    }   
    
}
