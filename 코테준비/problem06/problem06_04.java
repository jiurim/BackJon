package 코테준비.problem06;

import java.util.*;

public class problem06_04 {

    private static LinkedList<Integer> list = new LinkedList<>();
    private static HashSet<Integer> set = new HashSet<>();
    private static int s;

    public static void add(int value) {
        if (set.contains(value)) {
            list.remove((Integer) value);
        } 
        else {
            if (list.size() >= s) {
                int removed = list.removeLast();
                set.remove(removed);
            }

            set.add(value);
        }
        list.addFirst(value);
    }

    public static List<Integer> getList() {
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            add(sc.nextInt());
        }

        sc.close();
        for(int x : getList()){
            System.out.print(x + " ");
        }
    }
}
