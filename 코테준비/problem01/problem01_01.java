package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem01_01 {
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String text = buf.readLine().toLowerCase();
        String word = buf.readLine().toLowerCase();
        int cnt = 0;

        String [] txt = new String[text.length()];

        for(int i = 0;i<text.length();i++){
            txt[i] = String.valueOf(text.charAt(i));
        }

        for(int i = 0;i<text.length();i++){
            if(txt[i].equals(word)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }

}
