public class searchInBST {
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
            //riht subtreeg
            root.right =  insert(root.right, val);
        }
        else{
                root.left = insert(root.left, val);
        }
        return root;
    }
    public static boolean search(Node root, int val){
    if(root == null) {
        return false;
    }
    if(root.val == val ){
        return false;
    }
    if(root.val == val){
        return true;
    }
    if(val < root.val){
       return  search(root.left, val);
    }
    else{
       return  search(root.right, val);
    }
    }
    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }
        System.out.println(search(root, 3));
    }
}
