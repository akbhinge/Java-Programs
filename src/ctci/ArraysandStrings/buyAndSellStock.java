package ctci.ArraysandStrings;

import java.util.Scanner;

public class buyAndSellStock {

    private int getMaxProfit(int[] nums){

        if(nums == null || nums.length == 0){
            return 0;
        }

        int min = nums[0];
        int res=0;

        for(int price: nums){
            res = Math.max(res,price-min);
            min = Math.min(min,price);
        }

        return res;
    }

    private int getMaxProfit_Multiple(int[] nums){

        if(nums == null || nums.length == 0){
            return 0;
            }
        int profit = 0;
        for(int i=1;i< nums.length;i++){
            int diff = nums[i] - nums[i-1];
            if(diff > 0){
                profit += diff;
            }
        }
        return profit;
    }

    public static void main(String[] args){

        buyAndSellStock bs1 = new buyAndSellStock();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of stock array: ");
        int size = in.nextInt();

        System.out.println("Enter the stock prices: ");

        int[] stock = new int[size];

        for(int i=0; i< size;i++){
            stock[i] = in.nextInt();
        }
        System.out.println("Stock array: ");
        for(int price: stock){
            System.out.print(price + " ");
        }

        System.out.println("Max profit of: " + bs1.getMaxProfit(stock));
        System.out.println("Max profit(multiple) of: " + bs1.getMaxProfit_Multiple(stock));
    }
}
