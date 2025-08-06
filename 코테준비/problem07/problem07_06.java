package 코테준비.problem07;

// DFS로 부분집합 구하기
public class problem07_06 {
    static int n;
    static int[] check;//부분집합으로 사용여부 체크
    public void DFS(int L){
        if(L==n+1) {//종착점일때 
            String temp = "";
            for(int i =1; i<=n; i++){
                if(check[i]==1){
                    temp += (i+" ");
                }
            }
            if(temp.length()>0){
                System.out.println(temp);
            }
        }else{
            check[L] = 1; //사용한다 쪽으로 뻗기 전에는 check배열의 L번째 인덱스를 1로 초기화
            DFS(L+1); //왼쪽(부분집합으로 사용한다)으로 뻗기
            check[L] = 0; //사용하지 않는다 쪽으로 뻗기 전에는 check 배열의 L번째 인덱스를 0으로 초기화
            DFS(L+1); //오른쪽(부분집합으로 사용하지 않는다)으로 뻗기
        }
    }

    public static void main(String[] args) {
        problem07_06 T = new problem07_06();

        n=3;

        check = new int[n+1];
        T.DFS(1);
    }
    
}
