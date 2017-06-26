package ctci.StackandQueue;

import java.util.Scanner;
import java.util.Stack;

public class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void add(int value){
        s1.push(value);
    }

    public void moveElements(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }

    public int peek(){
        return s2.peek();
    }

    public int remove(){
        if(s2.empty()){
            System.out.println("Nothing to pop");
        }
        return
            s2.pop();
    }

    public boolean empty(){
        if(s2.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        MyQueue queue1 = new MyQueue();
        MyQueue queue2 = new MyQueue();

        Scanner in  = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size = in.nextInt();

        System.out.println("Enter stack elements");
        for(int i=0; i<size; i++){

            queue1.add(in.nextInt());
        }

        System.out.println("StackArray 1 elements: ");

        while(!queue1.empty()){
                int val = queue1.remove();
            System.out.println(val);
        }
        System.out.println();

        queue1.moveElements();

        System.out.println("StackArray 2 elements: ");

        while(!queue2.empty()){
            int val = queue2.remove();
            System.out.println(val);
        }
    }
}
