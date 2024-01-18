import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] cnt = new int[N];

        for(int i=0;i<N;i++){
            cnt[i] = sc.nextInt();
        }

        int min = cnt[0];
        int max = cnt[0];

        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] < min) {
                min = cnt[i];
            }
            if (cnt[i] > max) {
                max = cnt[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
