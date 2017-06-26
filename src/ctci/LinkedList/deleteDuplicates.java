package ctci.LinkedList;

import java.util.HashSet;

public class deleteDuplicates {

    Node head;

    public static void deleteDups(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node current = null;
        while (head != null) {
            if (set.contains(head.data)) {
                current.next = head.next;
            } else {
                set.add(head.data);
                current = head;
            }
            head = head.next;
        }
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



    public static void main(String[] args){




    }


}

