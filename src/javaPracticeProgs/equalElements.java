package javaPracticeProgs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
    private int equalDiff(int[] nums, int k){
        if(k <0 || nums.length == 0){
            return 0;
        }
        Map<Integer, Integer> map1 = new HashMap<>();

        for(int i=0; i < nums.length;i++){
            map1.put(nums[i],i);
        }

        int count1 = 0;

        for(int i =0;i< nums.length; i++){
            if(map1.containsKey(nums[i]+k) && map1.get(nums[i]+k) !=i){
                map1.remove(nums[i]+k);
                count1++;
            }
        }
        return count1;
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

        System.out.println();

        System.out.println("Enter k: ");

        int k = in.nextInt();

        System.out.println("K-diff moves required: "+ eq1.equalDiff(arr,k));

        in.close();
    }
}
