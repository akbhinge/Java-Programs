package ctci.ArraysandStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class palindromePermutations {


    public static boolean checkPermutation(String S){

        String convert = S.replaceAll("\\s+","").toLowerCase();
        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i < convert.length(); i++){

            char currentChar = convert.charAt(i);
            if(charSet.contains(currentChar)){
                charSet.remove(currentChar);
            } else {
                // add if it occurs for the first time
                charSet.add(currentChar);
            }
        }

        return charSet.size() <=1;
    }

    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);

        String string1;

        System.out.println("Enter the string: ");

        string1 = in.nextLine();

        System.out.println("Input string: "+ string1 );

        System.out.println();

        System.out.println("Can the string be permutation of palindrome: ");

        System.out.println(checkPermutation(string1));

        System.out.println();
    }
}
