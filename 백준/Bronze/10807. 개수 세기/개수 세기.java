import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n = sc.nextInt();

        int [] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            cnt[i] = sc.nextInt();
        }
        
        int a = sc.nextInt();

        for(int i=0;i<cnt.length;i++){
            if(cnt[i]==a){
                count++;
            }
        }
        System.out.println(count);
    }
}