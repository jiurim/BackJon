package 코테준비.problem03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problem03_01 {
    public static int[] Solution(int cnt1, int[] input1, int cnt2, int[] input2){
        int [] answer = new int[cnt1+cnt2];
        int index = 0;

        for(int i = 0; i<cnt1;i++){
            answer[index++] = input1[i];
        }

        for(int j = 0; j<cnt2; j++){
            answer[index++] = input2[j];
        }

        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int cnt1 = Integer.parseInt(buf.readLine());
        String [] text1 = buf.readLine().split(" ");
        int [] input1 = new int[cnt1];
        for(int i = 0 ; i< cnt1; i++){
            input1[i] = Integer.parseInt(text1[i]);
        }

        int cnt2 = Integer.parseInt(buf.readLine());
        String [] text2 = buf.readLine().split(" ");
        int [] input2 = new int[cnt2];
        for(int a = 0 ; a< cnt2; a++){
            input2[a] = Integer.parseInt(text2[a]);
        }

        for(int cn : Solution(cnt1,input1,cnt2,input2)){
            System.out.print(cn+" ");
        }
    }
}
