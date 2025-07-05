package 면접준비.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reversPrimeNumber {

    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i =2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static String Solution(int [] array){
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<array.length; i++){
            if(isPrime(array[i])==true){
                sb.append(array[i]+" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    
        int count = Integer.parseInt(buf.readLine());
    
        String line = buf.readLine();
        String[] tokens = line.split(" ");
    
        if (tokens.length != count) {
            throw new IllegalArgumentException("입력 개수가 맞지 않습니다.");
        }
    
        int[] reversedNumbers = new int[count];
    
        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder(tokens[i]);
            sb.reverse();
            reversedNumbers[i] = Integer.parseInt(sb.toString());
        }
    
        System.out.println(Solution(reversedNumbers).toString());
    }    
    
}
