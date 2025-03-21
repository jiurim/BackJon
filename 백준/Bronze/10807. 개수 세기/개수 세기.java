import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(buffer.readLine());
        String [] index = buffer.readLine().split(" ");
        int [] cnt = new int[num];
        int find = Integer.parseInt(buffer.readLine());
        int findcnt =0;
    

        for(int i = 0;i<cnt.length;i++){
            cnt[i] = Integer.parseInt(index[i]);

            if(cnt[i]==find){
                findcnt++;
            }
        }


        System.out.println(findcnt);
        

        

    }
}
