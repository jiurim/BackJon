import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static int[] solution(int[] progresses, int[] speeds){
        Queue<Integer> completionTimes = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0;i<progresses.length;i++){
            int remainingTime = (100-progresses[i])/speeds[i];
            if((100-progresses[i]) % speeds[i] >0){
                remainingTime++;
            }
            completionTimes.add(remainingTime);
        }

        int currentTime = completionTimes.poll();
        int releaseCount = 1;

        while(!completionTimes.isEmpty()){
            int nextCompletionTime = completionTimes.poll();

            if(nextCompletionTime<= currentTime){
                releaseCount++;
            }
            else{
                result.add(releaseCount);
                releaseCount= 1;
                currentTime = nextCompletionTime;
            }
        }

        result.add(releaseCount);

        return result.stream().mapToInt(i->i).toArray();

    }
}
