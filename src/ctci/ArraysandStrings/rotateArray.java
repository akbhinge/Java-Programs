package ctci.ArraysandStrings;

import java.util.Scanner;

public class rotateArray {


    private void rotate(int[][] arr){

        int[][] output = new int[arr.length][arr.length];

        for(int i=0; i< arr.length;i++){
            for(int j=0; j<arr.length;j++){


                output[i][j] = arr[arr.length-1-j][i];
            }
        }

        for (int[] anOutput : output) {
            for (int j = 0; j < output.length; j++) {
                System.out.print(anOutput[j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){

        rotateArray ra1 = new rotateArray();
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter the size of N*N array: ");

        int size = in.nextInt();

        int[][] input = new int[size][size];

        System.out.println("Enter the array elements: ");

        for(int i=0; i< size; i++){
            for(int j=0; j < size; j++){
                input[i][j] = in.nextInt();
            }
        }

        System.out.println("Input matrix:");

        for(int i=0; i< size; i++){
            for(int j=0; j < size; j++){
                System.out.print(input[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Matrix after rotation:");

        ra1.rotate(input);
    }
}
