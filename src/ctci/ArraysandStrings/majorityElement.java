package ctci.ArraysandStrings;

import java.util.Arrays;
import java.util.Scanner;

public class majorityElement {

    public static int majority(int[] array){

        if(array.length == 0){
            return -1;
        }

        if(array.length == 1){
            return array[0];
        }

        int count = 0;
        int major = 0;

        for(int i=0; i< array.length; i++){

            if(count == 0){
                major = array[i];
                count = 1;
            }else if(major == array[i]){
                count++;
            }else
                count--;
        }
            /*

        Arrays.sort(array);

        return (array[array.length/2]);*/
            return major;

    }


    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements: ");
        for(int i=0; i< size;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Array elements: ");
        for(int i=0; i< size;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Majority element: " + majority(arr));

    }
}
