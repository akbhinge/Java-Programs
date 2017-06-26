package ctci.RecursionandDP;

import java.util.Scanner;

public class magicIndex {

    private int magic(int[] arr, int low, int high){

        if(arr.length == 0){
            return -1;
        }

        if(arr.length == 1 && arr[0] == 0){
            return 0;
        }

        if(low > high){
            return -1;
        }

        int mid= (low+high)/2;

        int midValue = arr[mid];

        if(mid == midValue){
            return mid;
        }

        int leftIndex = Math.min(mid-1,midValue);
        int left = magic(arr, low, leftIndex);
        if(left >=0){
            return left;
        }

        int rightIndex = Math.max(mid+1,midValue);
        return magic(arr, rightIndex, high);
    }

    public static void main(String[] args){

        magicIndex m1 = new magicIndex();

        Scanner in  = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = in.nextInt();

        int[] magicArray = new int[size];

        System.out.println("Enter array elements: ");

        for(int i=0; i < magicArray.length;i++){
            magicArray[i] = in.nextInt();
        }

        System.out.println();

        System.out.println("Original array: ");

        for (int aMagicArray : magicArray) {
            System.out.print(aMagicArray + " ");
        }

        int first = 0;
        int last = size - 1;

        System.out.println();

        if(m1.magic(magicArray,first,last) != -1){
            System.out.println("Magic index at: " + m1.magic(magicArray,first,last));
        }
        else{
            System.out.println("No magic index");
        }
    }
}
