import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int [] cnt = new int[N];

        for(int i=0;i<N;i++){
            cnt[i] = sc.nextInt();
        }
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]<X){
                System.out.print(cnt[i]+" ");
            }
        }
    }
}
