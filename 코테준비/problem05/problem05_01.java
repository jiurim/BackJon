package 코테준비.problem05;

import java.io.*;
import java.util.Stack;

public class problem05_01 {
    public static String Solution(String input){
        Stack<Character> st = new Stack<>();

        for(char x : input.toCharArray()){
            if(x=='('){
                st.push(x);
            }else if(x==')'){
                if(st.isEmpty()){
                    return "NO";
                }
                st.pop();
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String input = buf.readLine();

        System.out.println(Solution(input));
        
    }
    
}
