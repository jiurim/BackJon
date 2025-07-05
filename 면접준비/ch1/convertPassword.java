package 면접준비.ch1;

import java.util.Scanner;

public class convertPassword {
    public static String Solution(int cnt, String password){
        String answer = "";

        if(password.trim().length() == cnt * 7){
            String temp = password.trim().replace('#', '1').replace('*', '0');
            for(int i = 0; i<cnt; i++){
                int convertInt = Integer.parseInt(temp.substring(i * 7, (i + 1) * 7),2);
                char completPassword = (char)convertInt;
                answer+=completPassword;
            }
        }else{
            System.out.println("비밀번호 숫자가 맞지 않습니다");
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();//개행제거하기 안그러면 숫자만 입력받고 입력이 끝남
        String password = sc.nextLine();

        System.out.print(Solution(cnt, password));

        sc.close();
        
    }
}
