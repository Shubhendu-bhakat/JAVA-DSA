import java.util.*;

public class printKthLevelNodes {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null; 
        }
    }
    public static void PrintLevelNodes(Node root, int k){
        if(root == null){
            return;
        }
        if(k == 1){
            System.out.print("data is "+root.val+" ");
        }
        if(k > 1){
            PrintLevelNodes(root.left, k-1);
            PrintLevelNodes(root.right, k-1);
        }
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        PrintLevelNodes(root, 3);
    }
}
