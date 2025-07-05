package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem01_04 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(buf.readLine());
        if(cnt>=3 && cnt<=20){
            ArrayList<String> array = new ArrayList<>();
            for(int i = 0; i<cnt; i++){
                String input = buf.readLine();
                StringBuilder sb = new StringBuilder(input);
                array.add(sb.reverse().toString());
            }

            for(String s : array){
                System.out.println(s);
            }
        }

    }
}
