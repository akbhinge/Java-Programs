package javaPracticeProgs;

import java.util.Scanner;

public class arrayRotate {

    public void Rotate(int[] nums, int k){

        reverse(nums, 0,nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums1, int l, int r){

        while(l <r){

            int temp = nums1[l];
            nums1[l] = nums1[r];
            nums1[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args){

        arrayRotate ar1 = new arrayRotate();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of array elements: ");

        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Input array: ");
        for(int element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Enter value to rotate array by: ");
        int k = in.nextInt();
        ar1.Rotate(arr,k);
        System.out.println("Rotated array: ");
        for(int element: arr){
            System.out.print(element + " ");
        }
    }
}
