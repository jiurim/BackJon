package 코테준비.problem01;

import java.util.Scanner;

public class problem01_10 {

    public static int [] Solution(String text, char word){
        int [] answer = new int[text.length()];

        int p = 1000;
        for(int i = 0; i<text.length(); i++){
            if(text.charAt(i)== word){
                p=0;
                answer[i] = p;
            } else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        for(int i = text.length()-1; i>=0; i--){
            if(text.charAt(i)==word){
                p=0;
            }
            else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        char word = sc.next().charAt(0);

        for(int x : Solution(text, word)){
            System.out.print(x+" ");
        }

        sc.close();
    }
}