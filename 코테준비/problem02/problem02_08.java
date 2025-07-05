package 코테준비.problem02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem02_08 {
    public static int [] Solution(int x, int[] a){
        int [] answer = new int[x];
        for(int i = 0;i < x;i++){
            int cnt = 1;
            for(int j = 0; j<x;j++){
                if(a[i]<a[j]){
                    cnt++;
                }
            }
            answer[i]=cnt;
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(buf.readLine());
        String [] text = buf.readLine().split(" ");
        int [] score = new int[count];

        for(int i = 0; i<count; i++){
            score[i] = Integer.parseInt(text[i]);
        }

        for(int x : Solution(count,score)){
            System.out.print(x+" ");
        }
    }
}
