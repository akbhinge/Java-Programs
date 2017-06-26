package ctci.TreesandGraphs;

public class check_BST {

    private Node root;
    private Node previous;

    private boolean isBST(){
        previous = null;
        return isBST(root);
    }

    private boolean isBST(Node head){

        if(head == null){
            return true;
        }

        if(head !=null){

            if(!isBST(head.left))
                return false;

            if(previous != null && head.data <=previous.data){
                return false;
            }
            previous = head;
            return isBST(head.right);
        }
        return true;
    }


    public static void main(String[] args){

        check_BST bstTree = new check_BST();

        bstTree.root = new Node(4);
        bstTree.root.left = new Node(2);
        bstTree.root.right = new Node(5);
        bstTree.root.left.left = new Node(1);
        bstTree.root.left.right = new Node(3);

        if(bstTree.isBST()){
            System.out.println("Binary search tree");
        }
        else
            System.out.println("Not a binary search tree");

    }
}


class Node{

    Node left;
    Node right;
    int data;

    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}