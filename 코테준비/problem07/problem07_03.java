package 코테준비.problem07;

//팩토리얼

public class problem07_03 {
    public int fac(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fac(n-1);
        }
    }
    public static void main(String[] args) {
        problem07_03 T = new problem07_03();
        System.out.println(T.fac(5));
    }
}
