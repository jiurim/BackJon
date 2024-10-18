import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    static int L, C;
    static char[] code;
    static char[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        L = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());

        code = new char[L]; // 조합의 길이
        list = new char[C]; // 입력된 문자의 수

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < C; i++) {
            list[i] = stringTokenizer.nextToken().charAt(0);
        }

        Arrays.sort(list);

        backtracking(0, 0);
    }

    static void backtracking(int now, int length) {
        if (length == L) {
            if (isCheck()) {
                System.out.println(String.valueOf(code)); // char 배열을 문자열로 변환하여 출력
            }
            return; // 유효하지 않은 경우에도 리턴
        }

        for (int i = now; i < C; i++) {
            code[length] = list[i];  // 현재 위치에 알파벳 선택
            backtracking(i + 1, length + 1);  // 다음 위치로 이동
        }
    }

    static boolean isCheck() {
        int mo = 0; // 모음 수
        int ja = 0; // 자음 수

        for (char x : code) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo++;
            } else {
                ja++;
            }
        }

        return mo >= 1 && ja >= 2; // 모음이 1개 이상, 자음이 2개 이상인지 체크
    }
}
