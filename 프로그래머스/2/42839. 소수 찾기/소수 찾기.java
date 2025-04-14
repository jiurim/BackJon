import java.util.HashSet;

class Solution {

    public HashSet<Integer> set = new HashSet<>();
    public boolean[] visited;

    // 소수 판별 메소드
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 백트래킹으로 숫자 조합 생성
    private void dfs(String numbers, String current, int length) {
        if (current.length() == length) {
            int num = Integer.parseInt(current);
            set.add(num); // HashSet으로 중복 제거
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i), length);
                visited[i] = false;
            }
        }
    }

    // 메인 메소드
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];

        // 길이 1부터 전체까지 가능한 조합 생성
        for (int i = 0; i < numbers.length(); i++) {
            dfs(numbers, "", i + 1);
        }

        int answer = 0;
        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }
}