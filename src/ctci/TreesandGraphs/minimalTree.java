package ctci.TreesandGraphs;

import java.util.Scanner;

public class minimalTree {

    private Node createMin(int[] arr, int start, int end){

        if(start > end){
            return null;
        }

        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);

        root.left = createMin(arr,start,mid-1);

        root.right = createMin(arr,mid+1,end);
        return root;
    }

    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args){

        minimalTree tree1 = new minimalTree();
        Node root;

        Scanner in  = new Scanner(System.in);
        System.out.println("Enter total elements: ");
        int size = in.nextInt();
        System.out.println("Enter elements for array:(Increasing order) ");

        int[] arr = new int[size];
        for(int i=0; i< arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println();

        System.out.println("Input array: ");

        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();

        root = tree1.createMin(arr,0,arr.length-1);

        System.out.println();
        System.out.println("BST with minimum height from given array:");
        tree1.preorder(root);
    }
}