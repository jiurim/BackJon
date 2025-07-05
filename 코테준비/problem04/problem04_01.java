package 코테준비.problem04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class problem04_01 {
    public static char Solution(int n, String s){
        char answer=' ';
        HashMap <Character, Integer> map = new HashMap<>();

        for( char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);
        }

        int max = Integer.MIN_VALUE;

        for(char key : map.keySet()){
            if(map.get(key)>max){
                max= map.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(buf.readLine());
        String str = buf.readLine();

        System.out.println(Solution(n,str));
    }
    
}
