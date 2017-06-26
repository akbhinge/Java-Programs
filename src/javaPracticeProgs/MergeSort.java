package javaPracticeProgs;

import java.util.Scanner;

public class MergeSort {



    public static void mergeArrays(int[] merged, int left, int mid, int right){

        int sub1 = mid - left + 1;

        int sub2 = right - mid;

        int[] leftArr = new int[sub1];

        int[] rightArr = new int[sub2];

        for(int i=0; i < sub1; ++i){
            leftArr[i] = merged[left + i];
        }

        for(int j=0; j < sub2; ++j){
            rightArr[j] = merged[mid+1+j];
        }


        int i=0,j=0;
        int k=1;

        while(i<sub1 && j<sub2){

            if(leftArr[i] <=rightArr[j]){
                merged[k] = leftArr[i];
                i++;
            }
            else{
                merged[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // if left array consists of any remaining elements
        while(i<sub1){
            merged[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<sub2){
            merged[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] input, int left, int right){
        if(left < right){

            int mid = (left + right)/2;

            sort(input,left,mid);
            sort(input,mid+1, right);


            // merge two sorted arrays together

            mergeArrays(input,left,mid,right);
        }
    }


    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements for array");
        int num = in.nextInt();

        System.out.println("Enter the elements: ");

        int[] arr = new int[num];
        for (int i=0; i< arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Unsorted array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] +" ");
        }

        System.out.println("Sorted array: ");

        sort(arr,0,arr.length-1);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] +" ");
        }

    }

}
