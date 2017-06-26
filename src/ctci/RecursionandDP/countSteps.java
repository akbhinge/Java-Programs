package ctci.RecursionandDP;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class countSteps {


    static int countSteps(int n){

        if(n < 0){
            return 0;
        }
        else if(n == 0){
            return 1;
        }
        else
            return countSteps(n-1) + countSteps(n-2) + countSteps(n-3);
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter steps to climb: ");
        int totalFloors = in.nextInt();

        System.out.println("Total ways to climb "+totalFloors+" steps: " + countSteps(totalFloors));
    }
}
