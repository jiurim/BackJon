package 코테준비.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem05_02 {
    public static Stack<Character> Solution(String input){
        Stack<Character> st = new Stack<>();

        for(char x : input.toCharArray()){
            if(x==')'){
                while(!st.isEmpty()){
                    char top=st.pop();
                    if(top=='('){
                        break;
                    }
                }
            }
            else{
                st.push(x);
            }
        }
        return st;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String input = buf.readLine();

        for(char x : Solution(input)){
            System.out.print(x);
        }
        
    }
}
