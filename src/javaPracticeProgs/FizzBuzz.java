package javaPracticeProgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

    public static List<String> numtoString(int n) {

        ArrayList<String> result = new ArrayList<String>();

        for(int i=1; i<=n; i++){
            if((i%3 == 0) && (i % 5 == 0)){
                result.add("FizzBuzz");
            }
            else if(i%3 == 0){
                result.add("Fizz");
            }
            else if(i%5 == 0){
                result.add("Buzz");
            }
            else
                result.add(Integer.toString(i));
        }
        return result;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = in.nextInt();
        System.out.println(numtoString(input));
    }
}
