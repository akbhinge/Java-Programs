package javaCollections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Bhinge on 25-Mar-17.
 */
public class javaQueues {

    public static void main(String[] args){
        /*
            Queue - FIFO - head and tail
         */

        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(4);

        q1.add(32);
        q1.add(1222);
        q1.add(5);
        q1.add(23);
        try {
            q1.add(67);
        }catch (IllegalStateException e){
            System.out.println("Queue already full");
        }

        for(Integer val:q1){
            System.out.println("Queue value:" + val);
        }


        System.out.println("Removed from queue:"+ q1.remove());
        System.out.println("Removed from queue:"+ q1.remove());
        System.out.println("Removed from queue:"+ q1.remove());

        try {
            System.out.println("Removed from queue:" + q1.remove());
        } catch(NoSuchElementException e){
            System.out.println("Removing extra items");
        }

        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        q2.offer(20);
        q2.offer(40);


        if(q2.offer(50) == false){
            System.out.println("cannot add third element");
        }

        for(Integer value: q2){
            System.out.println("Queue2 value: " +value);
        }

        // Poll removes elements, but does not throw exception, returns null

        System.out.println("Queue2 poll: " + q2.poll());
        System.out.println("Queue2 poll: " + q2.poll());
        System.out.println("Queue2 poll: " + q2.poll());
    }
}
