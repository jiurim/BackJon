import java.util.Collections;
import java.util.PriorityQueue;


public class Solution {
    public int solution(int[] priorities, int location){
        PriorityQueue<Integer> tmp = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for(int i=0;i<priorities.length;i++){
            tmp.add(priorities[i]);
        }

        while(!tmp.isEmpty()){
            for(int i = 0;i<priorities.length;i++){
                if(priorities[i]==tmp.peek()){
                    tmp.poll();
                    answer++;

                    if(i==location){
                        return answer;
                    }
                }
            }
        }        
        
        return answer;
    }
}
