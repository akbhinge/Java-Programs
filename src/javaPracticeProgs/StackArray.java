package javaPracticeProgs;

import java.util.Scanner;

public class StackArray {

    private int top;
    private int stackSize;
    private int[] stack;


    public StackArray(int s){
        top = -1;
        stackSize = s;
        stack = new int[stackSize];
    }

    public void push(int val){
        top++;
        stack[top] = val;
    }

    public int pop(){
        return stack[top--];
    }

    public int peek(){
        return stack[top];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }


    public static void main(String[] args){


        Scanner in = new Scanner(System.in);

        try{
            System.out.println("Enter size of array- ");


        int arraySize = in.nextInt() * 3;

        int[] arr = new int[arraySize];

        System.out.println("Enter array elements:");

        for(int i=0; i< arraySize;i++){
            arr[i] = in.nextInt();
        }


        System.out.println("Array elements: ");
        System.out.println();

        for(int i: arr){
            System.out.print(i + " ");
        }


        int stackSize = arraySize/3;

        StackArray s1 = new StackArray(stackSize);
        StackArray s2 = new StackArray(stackSize);
        StackArray s3 = new StackArray(stackSize);


        for(int i=0; i < arraySize/3; i++){
            s1.push(arr[i]);
        }

        for(int i=arraySize/3 ; i < (2*arraySize)/3; i++){
            s2.push(arr[i]);
        }

        for(int i= (2*arraySize)/3 ; i < arraySize ; i++){
            s3.push(arr[i]);
        }

        System.out.println();
        System.out.println("Stack1 elements: ");

        while(!s1.isEmpty()){
            int val = s1.pop();
            System.out.println(val);
        }
        System.out.println();

        System.out.println("Stack2 elements: ");

        while(!s2.isEmpty()){
            int val = s2.pop();
            System.out.println(val);
        }
        System.out.println();

        System.out.println("Stack3 elements: ");

        while(!s3.isEmpty()){
            int val = s3.pop();
            System.out.println(val);
        }
        System.out.println();

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Incorrect array length");
        }


        /*arrayStack s1 = new arrayStack(size);



        s1.push(100);
        s1.push(110);
        s1.push(120);
        s1.push(130);
        s1.push(140);

        System.out.print("Current top element in stack: "+s1.peek());
        System.out.println();

        System.out.println("arrayStack elements: ");

        while(!s1.isEmpty()){
            int val = s1.pop();
            System.out.println(val);
        }
        System.out.println();
        */

    }


}
