import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] supoja1 = {1,2,3,4,5};
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};

        for(int i = 0; i<answers.length;i++){
            if(supoja1[i%supoja1.length]== answers[i]){
                answer[0]++;
            }

            if(supoja2[i%supoja2.length]== answers[i]){
                answer[1]++;
            }

            if(supoja3[i%supoja3.length]== answers[i]){
                answer[2]++;
            }
        }

        int max = Arrays.stream(answer).max().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < answer.length; i++){
            if(max == answer[i]){
                list.add(i+1);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < result.length ; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}