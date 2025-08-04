package 코테준비.problem07;

//이진수 출력

public class problem07_02 {
    public void rec (int n){
        if(n==0){
            return;
        }
        else{
            rec(n/2);
            System.out.print(n%2 + " ");
        }
    }
    public static void main(String[] args) {
        problem07_02 t = new problem07_02();
        t.rec(11);
    }
}
