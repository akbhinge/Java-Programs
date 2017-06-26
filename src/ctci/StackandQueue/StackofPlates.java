package ctci.StackandQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackofPlates {

    ArrayList<Stack> s1;
    int stackSize;


    StackofPlates(int stackSize){

        s1.add(new Stack<Integer>());
        this.stackSize = stackSize;

    }

    public void push(int data){



    }





}

class Stack<Item> implements Iterable<Item> {

    private Node first;
    private int n;

    private class Node {

        Item item;
        Node next;
    }

    public Stack() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {

        return first == null;
    }


    public int size() {
        return n;
    }


    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Empty stack");
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

    private class ListIterator implements Iterator<Item> {

        Node current = first;
        int i = n;

        @Override
        public boolean hasNext() {
            return (i > 0);
        }

        @Override
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            i--;
            return item;

        }
    }
}