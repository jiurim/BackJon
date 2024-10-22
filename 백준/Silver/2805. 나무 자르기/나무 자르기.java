import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        long M = Integer.parseInt(stringTokenizer.nextToken());
        long max = 0;

        int [] trees = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        for(int i=0; i<trees.length;i++){
            trees[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(trees[i]>max){
                max=trees[i];
            }
        }

        long left = 0;
        long right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long total = 0;

            // 자른 나무의 합을 계산
            for (int i = 0; i < N; i++) {
                if (trees[i] > mid) {
                    total += (trees[i] - mid); // mid보다 큰 나무만 자름
                }
            }

            if (total >= M) {
                result = mid; // 가능한 높이 갱신
                left = mid + 1; // 더 높은 높이에서 탐색
            } else {
                right = mid - 1; // 더 낮은 높이에서 탐색
            }
        }

        System.out.println(result);
    }
}