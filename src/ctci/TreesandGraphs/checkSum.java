package ctci.TreesandGraphs;

import java.util.Scanner;

public class checkSum {

    private Node root;

    private boolean checkTotal(Node root, int sum) {
        return root != null && (root.left == null && root.right == null && root.data == sum || checkTotal(root.left, sum - root.data) || checkTotal(root.right, sum - root.data));
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter sum to check: ");
        int sum = in.nextInt();
        checkSum chk = new checkSum();
        chk.root = new Node(5);
        chk.root.left = new Node(4);
        chk.root.left.left = new Node(11);
        chk.root.left.left.left = new Node(7);
        chk.root.left.left.right = new Node(2);
        chk.root.left.right = new Node(3);
        chk.root.right = new Node(8);
        chk.root.right.left = new Node(13);
        chk.root.right.right = new Node(4);
        chk.root.right.right.right = new Node(1);

        if(chk.checkTotal(chk.root,sum)){
            System.out.println("There is sum from root to leaf");
        }
        else
            System.out.println("No sum");
    }
}


