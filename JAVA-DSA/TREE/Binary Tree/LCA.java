import java.util.ArrayList;

public class LCA {
 static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
 }
 public static Node Lca(Node root , int n1, int n2){
    ArrayList<Integer> path1 = new ArrayList<>();
    ArrayList<Integer> path2 = new ArrayList<>();
    getPath(root, n1 , path1);
    getPath(root,n2 ,path2);
    
 }
   public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

   } 
}