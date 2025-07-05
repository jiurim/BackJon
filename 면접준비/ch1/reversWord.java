package 면접준비.ch1;
import java.util.Scanner;

public class reversWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        String word[] = new String[cnt];

        if(cnt>=3 && cnt<=20){
            for(int i = 0; i<cnt; i++){
                word[i] = sc.next();
            }

            for(String x : word){
                for(int i = x.length()-1; i>=0; i--){
                    System.out.print(x.charAt(i));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}