package ctci.ArraysandStrings;

import java.util.Scanner;

public class stringCompress {


    public static String compress(String S){

        if(S.length() == 0){
            return null;
        }

        StringBuilder shortString = new StringBuilder();

        int charCount =0;

        for(int i=0; i < S.length(); i++){
            charCount++;
            if((i+1) >= S.length() || S.charAt(i) != S.charAt(i+1)){
                shortString.append(S.charAt(i));
                shortString.append(charCount);
                charCount=0;
            }
        }

        if(S.length() >= shortString.length()){
            return shortString.toString();
        }
        return S;
    }


    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);

        String string1;

        System.out.println("Enter the string to compress: ");

        string1 = in.nextLine();

        System.out.println("Input string: "+ string1 );

        System.out.println();

        System.out.println("Compressed string: ");

        System.out.println(compress(string1));

        System.out.println();
    }
}
