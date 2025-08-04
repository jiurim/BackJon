package 코테준비.problem07;

//재귀함수
public class problem07_01 {
    public void rec (int n){
        if(n==0){
            return;
        }else{
            rec(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        problem07_01 t = new problem07_01();
        t.rec(3);
    }
}

//재귀함수는 스택 프레임을 사용한다.
// 따라서, 출력문이 재귀 함수 위에 있으면 3 2 1
// 출력문 아래에 있으면 1 2 3이 출력된다.
