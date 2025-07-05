package 면접준비.ch1;
import java.util.Scanner;

public class convertWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();

        String array [] = new String[word.length()];

        for(int i = 0; i<word.length(); i++){
            array[i] = String.valueOf(word.charAt(i));
        }

        for(String x : array){
            if(x.equals(x.toUpperCase())){
                x=x.toLowerCase();
            }
            else if(x.equals(x.toLowerCase())){
                x= x.toUpperCase();
            }
            System.out.print(x);
        }

        sc.close();
    }
}