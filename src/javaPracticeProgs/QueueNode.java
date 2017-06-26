package javaPracticeProgs;

import java.util.Iterator;
import java.util.Scanner;

public class QueueNode<Item> implements Iterable<Item> {


    private Node front;
    private Node end;
    private int n;


    class Node{
        Item item;
        Node next;
    }


    public int size(){
        return n;
    }


    public QueueNode(){
        front = null;
        end = null;
        n=0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public void enqueue(Item val){

        Node old = end;
        end = new Node();
        end.item = val;
        end.next = null;

        if(isEmpty()){
            front = end;
        }
        else{
            old.next = end;
        }
        n++;
    }

    public Item dequeue(){
        Item item= front.item;
        front=front.next;
        if(isEmpty()){
            end=null;
        }
        n--;
        return item;
    }

    public Iterator<Item> iterator()
    {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item>{

        private Node current = front;
        private int i = n;

        public boolean hasNext()  {
            return (i>0);
        }


        public Item next() {

            Item item = current.item;
            current = current.next;
            i--;
            return item;
        }

    }


    public static void main(String[] args){
        QueueNode<Integer> q1= new QueueNode<>();


        Scanner in = new Scanner(System.in);

        System.out.println("Enter total queue elements: ");
        int total = in.nextInt();


        System.out.println("Enter queue elements: ");
        for(int i=0; i< total;i++) {
            q1.enqueue(in.nextInt());
        }

        /*q1.enqueue(21);
        q1.enqueue(22);
        q1.enqueue(7);
        q1.enqueue(7);*/

        System.out.println("Queue contains following items till this moment:");
        for (Integer i : q1){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Delete from queue:"+q1.dequeue());

        System.out.println("Queue contains following items now:");
        for (Integer i : q1){
            System.out.print(i+" ");
        }

    }

}
