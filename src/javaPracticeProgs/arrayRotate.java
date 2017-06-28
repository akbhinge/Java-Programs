package javaPracticeProgs;

import java.util.Scanner;

public class arrayRotate {

    private void Rotate(int[] nums, int k){

        reverse(nums, 0,nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k,nums.length-1);
    }

    private void reverse(int[] nums1, int l, int r){

        while(l <r){

            int temp = nums1[l];
            nums1[l] = nums1[r];
            nums1[r] = temp;
            l++;
            r--;
        }
    }

    private int findMin(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }

        int i=0,j=nums.length-1;

        while(i<j){
            int mid = i + (j-i) /2;

            if(mid >0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            if(nums[i] <= nums[mid] && nums[mid] > nums[j]){
                i = mid +1;
            }
            else{
                j = mid - 1;
            }
        }
        return nums[i];
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
        System.out.println();
        System.out.println("Min element from rotated array: " + ar1.findMin(arr));

        in.close();
    }
}
