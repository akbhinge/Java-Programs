package javaPracticeProgs;

import java.util.*;

public class StackNode<Item> implements Iterable<Item>{

    private Node first;
    private int n;

    private class Node{

        Item item;
        Node next;
    }

    public StackNode(){
        first = null;
        n = 0;
    }

    public boolean isEmpty(){

        return first == null;
    }


    public int size(){
        return n;
    }


    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Item pop(){
        if(isEmpty()){
            throw  new NoSuchElementException("Empty stack");
        }
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }


    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{

        Node current = first;
        int i = n;

        @Override
        public boolean hasNext() {
            return (i > 0);
        }

        @Override
        public Item next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            Item item =  current.item;
            current = current.next;
            i--;
            return item;

        }
    }




    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        StackNode<Integer> s1 = new StackNode<Integer>();

        System.out.println("Enter size of stack: ");
        int total = in.nextInt();


        System.out.println("Enter Stack elements: ");
        for(int i=0; i< total;i++) {
                s1.push(in.nextInt());
        }

            /*s1.push(12);
        s1.push(22);
        s1.push(32);
        s1.push(42);*/

        System.out.println("Size of stack: " + s1.size());

        System.out.println("Stack elements: ");

        for(Integer i : s1){
            System.out.println(i);
        }



    }


}
