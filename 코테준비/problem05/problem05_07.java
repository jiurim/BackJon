package 코테준비.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class problem05_07 {

    public static String Solution(String a, String b){
        String answer = "YES";

        Queue<Character> qu1 = new LinkedList<>();

        for(char x : a.toCharArray()){
            qu1.offer(x);
        }

        for(char x : b.toCharArray()){
            if(qu1.contains(x)){
                if(x!=qu1.poll()){
                    answer = "NO";
                }
            }
        }

        if(!qu1.isEmpty()){
            answer = "NO";
        }

        return answer;
    }
    public static void main(String[] args) throws IOException{

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String a = buf.readLine();
        String b = buf.readLine();

        System.out.println(Solution(a,b));
        
    }
    
}
