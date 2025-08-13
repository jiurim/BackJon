package 코테준비.problem06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    public int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point O){

        //오름차순
        if(this.x == O.x){
            return this.y - O.y;
        }else{
            return this.x - O.x;
        }

        //내림차순
        // if(this.x == O.x){
        //     return O.y-this.y;
        // }
        // else{
        //     return O.x - this.x;
        // }
    }
}

public class problem06_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Point> arr =new ArrayList<>();
        for(int i =0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr.add(new Point(x, y));
        }

        sc.close();

        Collections.sort(arr);

        for(Point o : arr){
            System.out.println(o.x + " " + o.y);
        }
    }
    
}
