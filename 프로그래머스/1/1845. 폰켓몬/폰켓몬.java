import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int max = nums.length/2;

        HashSet<Integer> cnt = new HashSet<>();

        for(int i : nums){
            cnt.add(i);
        }

        int size = cnt.size();

        if(size>=max){
            answer=max;
        }else {
            answer= size;
        }

        return answer;
    }
}