package ctci.LinkedList;

import java.util.Scanner;

public class listIntersection {

    Node head;


    public static Node intersection(Node L1, Node L2){

        int len1=0, len2=0;

        int diff = 0;


        if(L1 == null || L2 == null){
            return null;
        }

        Node merge1 = L1;
        while(merge1 !=null){

            len1++;
            merge1 = merge1.next;

        }

        Node merge2 = L2;
        while(merge2 !=null){
            len2++;
            merge2 = merge2.next;
        }

        diff = Math.abs(len1-len2);

        if(len1 < len2){
            merge1 = L2;
            merge2 = L1;
            diff = len2 - len1;
        }

        for(int count = 0; count < diff; count++)
            merge1 = merge1.next;
        while(merge1 != null && merge2 != null) {
            if(merge1 == merge2)
                return merge1;
            merge1 = merge1.next;
            merge2 = merge2.next;
        }

        return null;
    }


    public void addData(int val){

        Node head1 = new Node(val);

        head1.next = head;

        head = head1;

    }

    public void printList(Node h1){

        while(h1 != null){
            System.out.print(h1.data + "->" );
            h1 = h1.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements for 1st linked list");

        int input = in.nextInt();

        System.out.println("Enter the elements");


        listIntersection l1 = new listIntersection();

        for (int i = 0; i < input; i++) {
            l1.addData(in.nextInt());
            l1.printList(l1.head);
        }

        System.out.println("Enter number of elements for 2nd linked list");

        int input1 = in.nextInt();
        System.out.println("Enter the elements");


        listIntersection l2 = new listIntersection();

        for (int i = 0; i < input1; i++) {
            l2.addData(in.nextInt());
            l2.printList(l2.head);
        }

        System.out.println();

        if(intersection(l1.head,l2.head) == null){
            System.out.println("No intersection");
        }
        else
            System.out.println("Linked intersect at: " + intersection(l1.head,l2.head));

    }

}

