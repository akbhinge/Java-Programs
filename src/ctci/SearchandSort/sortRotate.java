package ctci.SearchandSort;

import java.util.Scanner;

public class sortRotate {

    private int searchRotate(int[] a, int target){

        int low = 0;
        int high = a.length - 1;

        while (low<=high) {

            int mid = (low + high) / 2;

            if(a[mid] == target){
                return mid;
            }

            if(a[low] <= a[mid]){
                if(target >= a[low] && target < a[mid]){
                    high = mid-1;
                }else
                    low = mid + 1;
            }

            if(a[mid] <= a[high]){
                if(target > a[mid] && target <= a[high]){
                    low = mid + 1;
                }else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        sortRotate sr1 = new sortRotate();

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
        System.out.println("Element found at: " + sr1.searchRotate(inputArray, seachValue));
    }
}
