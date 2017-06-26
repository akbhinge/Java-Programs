package javaPracticeProgs;

import java.util.Scanner;

public class Queue {

    private int capacity;
    private int[] queue;
    private int front = -1;
    private int rear = 0;


    public Queue(int size){
        capacity = size;
        queue = new int[capacity];
    }


    public void enqueue(int value){
        if(front < capacity - 1){
            front++;
            queue[front] = value;
            System.out.println();
            System.out.println("Element added to queue: " + value);
            displayQueue();
        }
        else
            System.out.println("Queue is full");
    }


    public void dequeue(){

        if(isQueueEmpty()) {
            System.out.println("Queue is empty");
        }else {
            if(front>=rear){
                rear++;
                System.out.println();
                System.out.println("Element removed from queue");
                displayQueue();
            }
        }
    }

    public void displayQueue(){
        if(front>=rear){
            System.out.println("Elements in queue: ");
            for(int i=rear; i <=front;i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }


    public boolean isQueueEmpty(){
        if (capacity == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int size = in.nextInt();
        Queue queue1 = new Queue(size);
        queue1.dequeue();

        for(int i=0; i<size;i++){
            queue1.enqueue(in.nextInt());
        }
       // queue1.enqueue(21);
       // queue1.enqueue(2);
       // queue1.enqueue(73);
       // queue1.enqueue(21);
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();
    }


}
