package 면접준비.ch2;
import java.util.Scanner;

public class theStudentInSight {

    public static int Solution(int studentCnt, int[] array){
        int answer = 1; //맨앞에 있는 사람은 항상 보임
        int max = array[0];

        for(int i =0; i<studentCnt; i++){
            if(array[i]>max){
                answer++;
                max = array[i];

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentCnt = sc.nextInt();
        sc.nextLine();
        String studentHeight = sc.nextLine();

        String [] tokens = studentHeight.split(" ");
        int [] array = new int[studentCnt];

        for(int i = 0; i<studentCnt; i++){
            array[i] = Integer.parseInt(tokens[i]);
        }
        sc.close();
        System.out.println(Solution(studentCnt, array));
    }
    
}
