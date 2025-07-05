package 면접준비.ch1;

import java.util.Scanner;

public class wordsInASentence{
    public static String Solution(String x){
        int length = Integer.MIN_VALUE;

        String answer = "";
        String txt[]  = x.split(" ");

        for(String s : txt){
            int len = s.length();
            if(len>length){
                length=len;
                answer=s;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();
        System.out.print(Solution(input));
    }
}