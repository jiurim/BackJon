import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(bf.readLine());
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i = 1;i<=N;i++){
            queue.offer(i);
        }

        while(queue.size()>1){
            queue.poll();
    
            int next = queue.poll();
            queue.offer(next);
        }

        System.out.println(queue.poll());
    }
    
}
