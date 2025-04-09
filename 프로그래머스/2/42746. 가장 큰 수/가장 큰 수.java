import java.util.Arrays;
class Solution {
    public String solution(int[] numbers){
        String answer = "";

        String[] numStrings = new String[numbers.length];

        for(int i = 0;i<numbers.length;i++){
            numStrings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStrings, (s1,s2) -> (s2+s1).compareTo(s1+s2));

        if(numStrings[0].equals("0")){
            return "0";
        }
        
        for(String str : numStrings){
            answer+= str;
        }
        return answer;
    }
}