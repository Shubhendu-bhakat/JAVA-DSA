import java.util.ArrayList;

public class printInRangeBST {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printINRangeOfBST(TreeNode root){
        if(root == null){
            return;
        }
        printINRangeOfBST(root.left);
        System.out.println(root.data);
        printINRangeOfBST(root.right);
    }
    //root to leaf of BST print
    public static void PrinbtRootToLeaf(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(list);
        }
        PrinbtRootToLeaf(root.left,list);
        PrinbtRootToLeaf(root.right,list);
        list.remove(list.size()-1);
    }
    public static TreeNode insert(TreeNode root,int data){
        if(root == null){
            return new TreeNode(data);
        }
        if(data > root.data){
            //riht subtreeg
            root.right =  insert(root.right, data);
        }
        else{
                root.left = insert(root.left, data);
        }
        return root;
    }
    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        TreeNode root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }
        PrinbtRootToLeaf(root, new ArrayList<>());
    }
}
