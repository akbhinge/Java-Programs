package ctci.SearchandSort;

import java.util.Scanner;

public class sortMerge {


    public static void sortMrg(int[] arr1, int[] arr2, int len1, int len2){

        int indexA = len1 - 1;
        int indexB = len2 - 1;

        int total= len1 + len2 - 1;

        while(indexB >=0){

            if(indexA >=0 && arr1[indexA] > arr2[indexB]){
                arr1[total]=arr1[indexA];
                indexA--;
            }
            else {
                arr1[total]= arr2[indexB];
                indexB--;
            }
            total--;
        }
        for(int i=0;i <total;i++){
            System.out.println(arr1[i]);
        }
    }


    public static void main(String[] args){


        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements for 1st array: ");

        int size1 = in.nextInt();

        System.out.println("Enter array elements: ");

        int[] array1 = new int[size1];

        for(int i=0; i< array1.length; i++) array1[i] = in.nextInt();

        System.out.println("Input array:");

        for (int i : array1) {

            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Enter number of elements for 2nd array: ");

        int size2 = in.nextInt();

        System.out.println("Enter array elements: ");

        int[] array2 = new int[size2];

        for(int i=0; i< array2.length; i++) array2[i] = in.nextInt();

        System.out.println("Input array:");

        for (int i : array2) {

            System.out.print(i + " ");
        }

        System.out.println();

        sortMrg(array1,array2,size1,size2);

    }

}
