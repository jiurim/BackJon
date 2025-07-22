import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> num = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();

        for (int i = 0; i < plays.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            if (!num.containsKey(genre)) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, play);
                music.put(genre, map);
                num.put(genre, play);
            } else {
                music.get(genre).put(i, play);
                num.put(genre, num.get(genre) + play);
            }
        }

        List<String> keySet = new ArrayList<>(num.keySet());

        Collections.sort(keySet, (s1, s2) -> num.get(s2) - num.get(s1));

        for (String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList<>(map.keySet());

            Collections.sort(genre_key, (i1, i2) -> {
                int cmp = map.get(i2) - map.get(i1);
                if (cmp == 0) return i1 - i2; // 재생 수 같으면 고유번호 오름차순
                return cmp;
            });

            answer.add(genre_key.get(0));
            if (genre_key.size() > 1) {
                answer.add(genre_key.get(1));
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
