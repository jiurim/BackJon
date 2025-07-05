package 코테준비.problem02;

import java.util.Scanner;

public class problem02_03 {
    public static String Solution(int a , int[][] array){
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<a; i++){
            int first = array[0][i];
            int second = array[1][i];
            String result="";

            if(first==1){
                if(second==2){
                    result="B";
                }else if(second==3){
                    result="A";
                }else if(second==1){
                    result="D";
                }
            }else if(first==2){
                if(second==2){
                    result="D";
                }else if(second==3){
                    result="B";
                }else if(second==1){
                    result="A";
                }
            }else if(first==3){
                if(second==3){
                    result="D";
                }else if(second==1){
                    result="B";
                }else if(second==2){
                    result="A";
                }
            }

            if(i==a-1){
                sb.append(result);
            }else{
                sb.append(result).append("\n");
            }
        }


        return sb.toString();
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int [][] fight = new int[2][input];

        for(int i = 0; i<2; i++){
            for(int j = 0 ; j<input; j++){
                fight[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        System.out.println(Solution(input,fight));


    }
    
}
