public class buildBST {
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
public static Node insert(Node root,int val){
    if(root == null){
        return new Node(val);
    }
    if(val > root.val){
        //right subtree
        root.right =  insert(root.right, val);
    }
    else{
            root.left = insert(root.left, val);
    }
    return root;
}
public static int printTree(Node root){
    if(root == null){
        return 0;
    }
   
   
    if(root.left == null && root.right == null){
        return root.val;
    }
    
    return  printTree(root.left)+  printTree(root.right) + root.val;
 
}
    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        for(int i=0;i<val.length;i++){
            insert(null, val[i]);
        }
        Node node = new Node(5);
        node.left = new Node(4);
        node.right = new Node(3);
        System.out.println(printTree(node));
    }
}