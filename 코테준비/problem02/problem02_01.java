package 코테준비.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem02_01 {
    public static ArrayList<Integer> Solution(int a , int[] s){
        ArrayList<Integer> array = new ArrayList<>();

        array.add(s[0]);

        for(int i = 1; i<a; i++){
            if(s[i]>s[i-1]){
                array.add(s[i]);
            }
        }

        return array;

    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int input1 = Integer.parseInt(buf.readLine());

        int[] cnt = new int[input1];

        String[] token = buf.readLine().split(" ");

        for(int j = 0 ; j<input1; j++){
            cnt[j] = Integer.parseInt(token[j]);
        }

        for(int x : Solution(input1, cnt)){
            System.out.print(x+" ");
        }
    }
}
