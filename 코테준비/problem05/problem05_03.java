package 코테준비.problem05;

import java.util.Scanner;
import java.util.Stack;

public class problem05_03 {
    public static int Solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int pushNum=0;

        for(int i=0; i<moves.length; i++){
            int start = moves[i]-1;

            for(int x =0 ; x<board.length; x++){
                if(board[x][start]!=0){
                    pushNum = board[x][start];
                    if(!st.isEmpty() && st.peek()==pushNum){
                        st.pop();
                        answer+=2;
                        board[x][start]=0;
                    }else {
                        st.push(board[x][start]);
                    }
                    board[x][start]=0;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [][] board = new int[N][N];
        for(int i =0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int M = sc.nextInt();
        int [] moves = new int[M];

        for(int i = 0; i<M; i++){
            moves[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Solution(N,board,M,moves));
    }
    
}
