package 코테준비.problem07;

import java.util.LinkedList;
import java.util.Queue;

//BFS로 이진트리 순회

class Node{
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}

public class problem07_07 {
    Node root;
    public void BFS(Node root){
        Queue<Node>  Q = new LinkedList<Node>();

        Q.offer(root);
        int L = 0; //루트 노드의 레벨은 0

        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i = 0; i<len; i++){
                Node current = Q.poll();
                System.out.print(current.data + " ");
                if(current.lt!=null){
                    Q.offer(current.lt);
                }
                if(current.rt !=null){
                    Q.offer(current.rt);
                }
            }
            L++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        problem07_07 tree = new problem07_07();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);

    }
}
