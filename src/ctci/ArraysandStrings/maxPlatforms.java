package ctci.ArraysandStrings;

import java.util.Scanner;

public class maxPlatforms {

    private int getPlatforms(double[] arr1, double[] arr2, int trains){

        int totalPlatforms = 0;
        int currentPlatforms = 0;

        int i=0,j=0;

        while(i< trains && j < trains){
            if(arr1[i] < arr2[j]){
                currentPlatforms++;
                i++;
                if(currentPlatforms > totalPlatforms){
                    totalPlatforms = currentPlatforms;
                }
            }else {
                currentPlatforms--;
                j++;
            }
        }
        return totalPlatforms;
    }

    public static void main(String[] args){

        maxPlatforms mp1 = new maxPlatforms();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter total number of trains: ");

        int total = in.nextInt();

        double[] arrival = new double[total];

        System.out.println("Enter arrival times of trains: ");
        for(int i=0; i<total;i++){
            arrival[i] = in.nextDouble();
        }

        double[] departures = new double[total];

        System.out.println("Enter departure times of trains: ");
        for(int i=0; i<total;i++){
            departures[i] = in.nextDouble();
        }

        System.out.println();
        System.out.println("No of platforms required: " + mp1.getPlatforms(arrival,departures,total));
    }
}
