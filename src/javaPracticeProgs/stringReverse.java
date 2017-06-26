package javaPracticeProgs;

import java.util.Scanner;

public class stringReverse {


    private static String strReverse(String s){

        char[] strArray=s.toCharArray();
        StringBuilder s1=new StringBuilder();


        for(int i=strArray.length-1;i>=0;i--){
            s1.append(strArray[i]);
        }

        return s1.toString();
    }


    public static void main(String[] args){

        System.out.println("String to reverse: ");

        Scanner in = new Scanner(System.in);
        String input= in.nextLine();

        System.out.println("String to reverse: ");
        System.out.println(input);

        System.out.println();

        System.out.println("Reversed string: "+ strReverse(input));
    }
}
