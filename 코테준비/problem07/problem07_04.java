package 코테준비.problem07;

//메모이제이션 활용한 피보나치
public class problem07_04 {
    static int[] fibo;

    public int Fib(int n){
        if(fibo[n]>0){
            return fibo[n];
        }
        if(n==1){
            return fibo[n]=1;
        }else if(n==2){
            return fibo[n]=1;
        }else{
            return fibo[n]= Fib(n-2)+Fib(n-1);
        }
    }
    public static void main(String[] args) {
        problem07_04 T = new problem07_04();
        int n = 45;
        fibo = new int[n+1];

        T.Fib(n);

        for(int i =1; i<=n; i++){
            System.out.print(fibo[i]+ " ");
        }
    }
    
}
