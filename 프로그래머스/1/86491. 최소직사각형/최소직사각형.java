import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int max_hight = 0;
        int max_width = 0;

        for(int i = 0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }

        for(int i = 0;i<sizes.length;i++){
            if(max_hight < sizes[i][0]){
                max_hight = sizes[i][0];
            }

            if(max_width < sizes[i][1]){
                max_width = sizes[i][1];
            }
        }
        return max_hight*max_width;
    }
}