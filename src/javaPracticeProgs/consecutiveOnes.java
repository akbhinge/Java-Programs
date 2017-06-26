package javaPracticeProgs;

import java.util.Scanner;

public class consecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            if(num == 1){
                count1++;
            }
            else{
                count1 = 0;
            }
            if(count1 > count2){
                count2 = count1;
            }
        }
        return count2;
    }

    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter total elements for the array: ");
        int input = in.nextInt();

        int[] nums = new int[input];

        System.out.println("Enter the elements for the array: ");
        for(int i=0; i < nums.length; i++){
           nums[i] = in.nextInt();
        }

        System.out.println("Original Binary array: ");
        for(int i=0; i < nums.length; i++) {
            System.out.print( nums[i] + " ");
        }

        System.out.println();
        System.out.println("Consecutive ones in array: ");
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
