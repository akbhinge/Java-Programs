package javaPracticeProgs;


import java.util.Scanner;

class Node{

    private int data;
    private Node next;


    public Node(){
        data = 0;
        next= null;
    }

    public Node(int d, Node n){
        data = d;
        next = n;
    }

    public void setNext(Node n){
        next = n;
    }
    public void setData(int d){
        data = d;
    }

    public Node getNext(){
        return next;
    }

    public int getData(){
        return data;
    }

}


class LinkedList {

    private Node head;
    private Node last;
    private int listSize;

    public LinkedList(){
        head = null;
        last = null;
        listSize = 0;
    }

    public boolean checkEmpty(){
        return head == null;
    }

    public int getListSize(){
        return listSize;
    }

    public void insertAtHead(int val){

        Node toInsert = new Node(val, null);
        listSize++;

        if(head == null){
            head = toInsert;
            last = head;
        }
        else{
            toInsert.setNext(head);
            head = toInsert;
        }
    }

    public void insertBetween(int val, int pos){

        Node toInsert = new Node(val,null);

        pos = pos - 1;

        for(int i=1; i <listSize; i++){
            if(i == pos) {
                Node curr = head.getNext();
                head.setNext(toInsert);
                toInsert.setNext(curr);
                break;
            }
            head = head.getNext();
        }
        listSize++;
    }

    public void insertAtEnd(int val){

        Node toInsert = new Node(val,null);

        listSize++;

        if(head == null){
            head = toInsert;

            //make head node as last node
            last = head;
        }
        else{
            last.setNext(toInsert);
            last = toInsert;
        }
    }

    public void deleteNode(int pos){

        if(pos == 1){
            head = head.getNext();
            listSize--;
            return;
        }

        // if position to be deleted is the last node
        if(pos == listSize){
            Node start = head;
            Node end = head;

            while(start != last){
                end = start;
                start = start.getNext();
            }
            last = end;
            end.setNext(null);
            listSize--;
            return;
        }

        pos = pos - 1;

        for(int i=1; i< listSize - 1; i++){
            if(i == pos){
                Node temp = head.getNext();
                temp = temp.getNext();
                head.setNext(temp);
                break;
            }
            head = head.getNext();
        }
        listSize--;
    }

    public void display(){
        System.out.println();

        if(listSize == 0){
            System.out.println("Empty list");
            return;
        }

        if(head.getNext() == null){
            System.out.println(head.getData());
            return;
        }

        System.out.print(head.getData()+ "-");

        head = head.getNext();

        while(head.getNext() != null){
            System.out.print(head.getData()+ "-");
            head = head.getNext();
        }
        System.out.print(head.getData());
        System.out.println();
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        LinkedList l1 = new LinkedList();
        char ch;
        do {


            System.out.println("1. Insert at head");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete element");

            System.out.println("Enter choice");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element to insert: ");
                    l1.insertAtHead(in.nextInt());
                    l1.display();
                    break;

                case 2:
                    System.out.println("Enter element to insert");
                    l1.insertAtEnd(in.nextInt());
                    l1.display();
                    break;

                case 3:
                    System.out.println("Enter element to insert");
                    int num = in.nextInt();
                    System.out.println("Enter position");
                    int pos = in.nextInt();
                    if (pos <= 1 || pos > l1.getListSize())
                        System.out.println("Invalid position");
                    else
                        l1.insertBetween(num, pos);
                    l1.display();
                    break;

                case 4:
                    System.out.println("Enter position to delete");
                    int delete = in.nextInt();
                    if (delete < 1 || delete > l1.getListSize())
                        System.out.println("Invalid position\n");
                    else
                        l1.deleteNode(delete);
                    l1.display();
                    break;

                default:
                    System.out.println("Invalid");
                    break;
            }
            ch = in.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }

}
