package javaPracticeProgs;

import java.util.Scanner;

public class BinarySearch {


    private static int search(int[] arr, int value){

        if(arr.length==0){
            return -1;
        }

        if(value >= arr[arr.length-1]){
            return arr.length;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]>= value){
                return i;
            }
        }
           /* int low = 0;
            int high = arr.length -1;

            if(value >= arr[arr.length-1]){
                return arr.length;
            }

            while(low<=high){

                int mid = (low+high)/2;

                if(arr[mid] == value){
                    return mid;
                }

                else if(arr[mid] < value){
                    low = mid + 1;
                }
                else
                    high = mid - 1;
            }*/
            return -1;
    }


    public static void main(String[] args){

        System.out.println("Enter number of elements for array: ");

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        System.out.println("Enter array elements: ");

        int[] inputArray = new int[size];

        for(int i=0; i< inputArray.length; i++) inputArray[i] = in.nextInt();

        System.out.println("Input array:");

        for (int i : inputArray) {

            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Enter element to search: ");

        int seachValue = in.nextInt();

        //if(search(inputArray,seachValue) !=-1) {
            System.out.println("Element found at: " + search(inputArray, seachValue));
        //}
    }
}
