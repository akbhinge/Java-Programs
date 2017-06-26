package javaPracticeProgs;

import java.util.Arrays;
import java.util.Scanner;

public class equalElements {

    private int getEqualCount(int[] nums){

        int min =Integer.MAX_VALUE;
        for(int num: nums){
            if(num < min){
                min = num;
            }
        }
        int count=0;
        for(int num: nums){
            count +=  num - min;
        }
        return count;
    }

    private int getEqualCount2(int[] nums1){

        Arrays.sort(nums1);
        int i=0, j= nums1.length-1;
        int count = 0;
        while(i <j){
            count += nums1[j]-nums1[i];
            i++;
            j--;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        equalElements eq1 = new equalElements();

        System.out.println("Enter arr size: ");

        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter arr elements: ");

        for(int i=0; i< size;i++){
            arr[i] = in.nextInt();
        }

        System.out.println();

        System.out.println("Minimum moves to equal array elements: " + eq1.getEqualCount(arr));

        System.out.println();

        System.out.println("Min moves to equal array elements if + and - allowed: " + eq1.getEqualCount2(arr));

        in.close();
    }
}
