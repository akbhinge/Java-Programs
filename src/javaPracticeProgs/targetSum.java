package javaPracticeProgs;

import java.util.Scanner;

public class targetSum {

    int count = 0;

    public int findTargetSumWays(int[] nums, int S) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        helper(nums,S,0);
        return count;
    }

    public void helper(int[] nums, int S, int start){
        if(start == nums.length){
            if(S==0){
                count++;
            }
            return;
        }
        helper(nums,S+ nums[start],start+1);
        helper(nums,S- nums[start],start+1);
    }

    public static void main(String[] args) {

        targetSum ts1 = new targetSum();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = in.nextInt();

        System.out.println("Enter array elements: ");

        int[] arr = new int[size];

        for(int i=0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter target sum: ");
        int Sum = in.nextInt();
        System.out.println();
        System.out.println("No of ways for target sum: " + ts1.findTargetSumWays(arr,Sum));

    }
}
