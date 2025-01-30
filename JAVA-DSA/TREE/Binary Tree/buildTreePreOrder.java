import java.util.LinkedList;
import java.util.Queue;

public class buildTreePreOrder { // pre order tree building
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
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int nodes[]){
                    idx++;
                    if(nodes[idx] == -1){ // if the tree has only one node i.e null
                         return null;
                    }
                    Node newNode = new Node(nodes[idx]);
                    newNode.left = buildTree(nodes);
                    newNode.right = buildTree(nodes);
                    return newNode; 
        
        }
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder( root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(currNode.data);
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }


        }
        public static int heigh(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = heigh(root.left);
            int rightHeight = heigh(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
        public static int daimeter(Node root){
            if(root == null){
                return 0;
            }
            int leftDaimeter = daimeter(root.left);
            int rightDaimeter =daimeter(root.right);
            int leftHeight = heigh(root.left);
            int rightHeight = heigh(root.right);
            int selfDaimeter = leftHeight+rightHeight+1;
            return Math.max(selfDaimeter,Math.max(leftDaimeter,rightDaimeter));

        }
    }
            public static void main(String[] args) {
                int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                BinaryTree tree = new BinaryTree();
                Node root = tree.buildTree(nodes);
        //         tree.levelOrder(root);
        //         System.out.println();
        // System.out.println(root.data);
        System.out.println(tree.daimeter(root));
    }
}