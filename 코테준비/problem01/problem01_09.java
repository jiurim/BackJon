package 코테준비.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class problem01_09 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder(); 

        String text = bf.readLine().toLowerCase();

        for(char x : text.toCharArray()){
            if(Character.isLetter(x)){
                sb.append(x);
            }
        }

        String origin = sb.toString();

        String reverse = sb.reverse().toString();

        if(origin.equals(reverse)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
