package ctci.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class palindrome {


    Node head;


    public boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }


        Node reverse = ReverseNode(head);

        return isEqual(head, reverse);
    }


    public static Node ReverseNode(Node head){

        Node previous = null;
        Node current = head;

        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


    boolean isEqual(Node h1, Node h2){

        while(h1 != null && h2 != null) {
            if (h1.data != h2.data) {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        return h1 == null && h2 == null;
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

        System.out.println("Enter number of elemets for linked list");

        int input = in.nextInt();

        System.out.println("Enter the elements");


        palindrome p1 = new palindrome();

        for (int i = 0; i < input; i++) {
            p1.addData(in.nextInt());
            p1.printList(p1.head);
        }

        System.out.println();

        if(p1.isPalindrome(p1.head) != false){

            System.out.println("Palindrome linked list");
            System.out.println();
        } else{
            System.out.println("Not Palindrome linked list");
            System.out.println();
        }
    }


}

class Node{

    int data;
    Node next;

    Node(int d){
        this.data = d;
        this.next = null;
    }
}




