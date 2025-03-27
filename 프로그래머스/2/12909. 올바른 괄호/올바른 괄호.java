import java.util.Stack;
public class Solution {
    public static boolean solution(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                parentheses.push('(');
            } else if (s.charAt(i) == ')') {
                if (parentheses.isEmpty()) {
                    return false;
                }
                parentheses.pop();
            }
        }

        return parentheses.isEmpty();
    }
}