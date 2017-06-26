package ctci.StackandQueue;

import java.util.Scanner;

public class minStack {

    private int top;
    private int value;
    private int stackSize;
    private int[] stack;


    public minStack(int s) {
        top = -1;
        stackSize = s;
        value = 0;
        stack = new int[stackSize];
    }

    public void push(int val) {
        top++;
        stack[top] = val;
    }

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public int min(minStack S1) {

        minStack min = new minStack(stackSize);

        S1.push(value);

        min.push(value);

        int minimum = value;

        for(int i=1; i< stackSize - 1; i++){
            S1.push(value);

        if (value < minimum) {
            minimum = value;
        }

            min.push(minimum);
        }

        while(!S1.isEmpty() && !min.isEmpty()){

            if(S1.pop() == min.pop()){
                return minimum;
            }
        }
        return minimum;
    }


    public static void main(String[] args){


        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of stack- ");


        int size = in.nextInt();

        minStack minStack1 = new minStack(size);

        System.out.println("Enter stack elements");
        for (int i = 0; i < size; i++) {

            minStack1.push(in.nextInt());
        }

        System.out.println();

        System.out.println("Minimum element from stack: ");


        System.out.println(minStack1.min(minStack1));

    }




}
