import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String [] index = bf.readLine().split(" ");
        int N = Integer.parseInt(index[0]);
        int K = Integer.parseInt(index[1]);

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=N;i++){
            queue.add(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        while(!queue.isEmpty()){
            for(int i=0;i<K-1;i++){
                queue.add(queue.remove());
            }
            result.append(queue.remove());
            if(!queue.isEmpty()){
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result);
    }
    
}
