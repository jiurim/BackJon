package 면접준비.ch1;

import java.util.Scanner;

public class findWord {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        String input = sc.next().toLowerCase();
        String array[] = new String[input.length()];
        
        for(int i = 0;i<input.length();i++){
            array[i] = String.valueOf(input.charAt(i));
        }

        String word = sc.next();

        int cnt = 0;


        for(String x : array){
            if(x.equals(word)){
                cnt++;
            }
        }
        sc.close();
        System.out.println(cnt);
    }
    
}
