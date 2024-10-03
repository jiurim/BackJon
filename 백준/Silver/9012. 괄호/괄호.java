import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder

        for (int i = 0; i < T; i++) {
            String vpc = bufferedReader.readLine();

            Stack<Character> stack = new Stack<>(); // 각 테스트 케이스마다 새로운 스택 생성
            boolean isBalanced = true;

            for (int j = 0; j < vpc.length(); j++) {
                char currentChar = vpc.charAt(j);

                if (currentChar == '(') {
                    stack.push(currentChar);  // '('는 스택에 추가
                } else if (currentChar == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();  // 스택에 '('가 있으면 pop
                    } else {
                        isBalanced = false;  // 스택이 비어 있는데 ')'가 나오면 불균형
                        break;
                    }
                }
            }

            // 스택에 여전히 '('가 남아 있으면 불균형
            if (!stack.isEmpty()) {
                isBalanced = false;
            }

            // 결과를 StringBuilder에 추가
            if (isBalanced) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }

        // 모든 결과를 한 번에 출력
        System.out.print(result.toString());
    }
}