import java.util.*;

public class Solution {
    public static int[] solution(int[] arr){
        List<Integer> result = new ArrayList<>();

        result.add(arr[0]);

        for(int i = 1;i<arr.length;i++){
            if(arr[i]!= arr[i-1]){
                result.add(arr[i]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1})));
        
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));

    }
}