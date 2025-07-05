package 코테준비.problem04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class problem04_02 {
    public static String Solution(String txt1, String txt2){
        String answer = " ";

        txt1 = txt1.toLowerCase();
        txt2 = txt2.toLowerCase();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char key1 : txt1.toCharArray()){
            map1.put(key1,map1.getOrDefault(key1, 0)+1);
        }

        for(char key2 : txt2.toCharArray()){
            map2.put(key2,map2.getOrDefault(key2, 0)+1);
        }
        int yes = 0;

        for(char x : map1.keySet()){
            if(map1.get(x)==map2.get(x)){
                yes++;
            }
            if(map1.size() ==yes){
                answer="YES";
            }
            else if(map1.size()!=yes){
                answer="NO";
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String input1 = buf.readLine();
        String input2 = buf.readLine();

        System.out.println(Solution(input1, input2));
    }
    
}
