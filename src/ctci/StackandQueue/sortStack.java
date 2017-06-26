package ctci.StackandQueue;

import java.util.Scanner;

public class sortStack {
    private int top;
    private int stackSize;
    private int[] stack;

    public sortStack(int s){
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


    void Sort(sortStack S){

        sortStack tempStack = new sortStack(stackSize);

        while(!S.isEmpty()) {
            int currentTop = S.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > currentTop) {
                S.push(tempStack.pop());
            }
            tempStack.push(currentTop);
        }
        while(!tempStack.isEmpty()){
            System.out.println(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of stack- ");

        int arraySize = in.nextInt();

        sortStack ss1 = new sortStack(arraySize);

        System.out.println("Enter stack elements");
        for (int i = 0; i < arraySize; i++) {

            ss1.push(in.nextInt());
        }

        System.out.println();

        System.out.println("StackArray elements after sorting: ");

        ss1.Sort(ss1);


    }

    }
