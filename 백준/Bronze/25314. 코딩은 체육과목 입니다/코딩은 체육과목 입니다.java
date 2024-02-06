import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        
        int num_long = N / 4; 
        
        StringBuilder dataType = new StringBuilder();
        
        for (int i = 0; i < num_long; i++) {
            dataType.append("long ");
        }
        
        dataType.append("int");
        
        System.out.println(dataType);
        
        sc.close();
    }
}
