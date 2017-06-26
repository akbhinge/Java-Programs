package ctci.TreesandGraphs;

public class checkBalance {

    private Node root;

    private boolean isBalanced(){

        return (getNodeCount(root) != -1);
    }

    private int getNodeCount(Node head){

        if(head == null){
           return 0;
        }

        int leftTree = getNodeCount(head.left);
        int rightTree = getNodeCount(head.right);

        if(leftTree == -1){
             return -1;
        }

        if(rightTree == -1){
            return -1;
        }

        if(leftTree - rightTree > 1 || rightTree - leftTree > 1){
            return -1;
        }

        return 1 + (leftTree > rightTree ? leftTree: rightTree);
    }
    public static void main(String[] args){

        checkBalance cb1 = new checkBalance();

        cb1.root = new Node(4);
        cb1.root.left = new Node(2);
        cb1.root.right = new Node(5);
        cb1.root.left.left = new Node(1);
        cb1.root.left.right = new Node(3);
        cb1.root.left.left.left = new Node(1);
        cb1.root.left.left.right = new Node(4);

        if(cb1.isBalanced()){
            System.out.println("Balanced binary tree");
        }
        else
            System.out.println("Not a balanced binary tree");
    }
}